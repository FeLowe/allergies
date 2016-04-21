import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.ArrayList;
import java.io.Console;
import java.util.regex.Pattern;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";
    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/input.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/output", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/output.vtl");

      Allergies allergiesList = new Allergies();

      Integer inputtedNumber = Integer.parseInt(request.queryParams("score"));
      // Integer inputtedAmount = Integer.parseInt(inputtedAmountString);


      ArrayList result = allergiesList.findAllergies(inputtedNumber);

      model.put("result", result);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }


}
