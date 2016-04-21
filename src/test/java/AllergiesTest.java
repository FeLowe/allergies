import java.util.ArrayList;
import java.util.Arrays;
import org.junit.*;
import static org.junit.Assert.*;
import org.fluentlenium.adapter.FluentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AllergiesTest extends FluentTest{
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void RootAllergies() {
    goTo("http://localhost:4567/");
    fill("#score").with("4");
    submit(".btn");
    assertThat(pageSource()).contains("shellfish");
  }

  @Test
  public void AllergiesScore_takesScoreof1_eggs() {
    Allergies testAllergiesScore = new Allergies();
    ArrayList<String> expected = new ArrayList<>(Arrays.asList("eggs"));

    assertEquals(expected, testAllergiesScore.findAllergies(1));
  }

  @Test
  public void AllergiesScore_takesScoreof2_peanuts() {
    Allergies testAllergiesScore = new Allergies();
    ArrayList<String> expected = new ArrayList<>(Arrays.asList("peanuts"));

    assertEquals(expected, testAllergiesScore.findAllergies(2));
  }
  @Test
  public void AllergiesScore_takesScoreof224_catsPollenChocolate() {
    Allergies testAllergiesScore = new Allergies();
    ArrayList<String> expected = new ArrayList<>(Arrays.asList("cats", "pollen", "chocolate"));

    assertEquals(expected, testAllergiesScore.findAllergies(224));
  }

}
