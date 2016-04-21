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

  // @Test
  // public void CoinCombination() {
  //   goTo("http://localhost:4567/");
  //   fill("#cents").with("36");
  //   submit(".btn");
  //   assertThat(pageSource()).contains(" 1 Quarter 1 Dime 1 Penny");
  // }

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

}
