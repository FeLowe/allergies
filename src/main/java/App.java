import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.io.Console;
import java.util.regex.Pattern;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    // String layout = "templates/layout.vtl";
    // get("/", (request, response) -> {
    //   Map<String, Object> model = new HashMap<String, Object>();
    //   model.put("template", "templates/input.vtl");
    //   return new ModelAndView(model, layout);
    // }, new VelocityTemplateEngine());
    //
    // get("/output", (request, response) -> {
    //   Map<String, Object> model = new HashMap<String, Object>();
    //   model.put("template", "templates/output.vtl");
    //
    //   CoinCombinations myCoinCombinations = new CoinCombinations();
    //
    //   String inputtedAmountString = request.queryParams("cents");
    //   Integer inputtedAmount = Integer.parseInt(inputtedAmountString);
    //
    //
    //   String result = myCoinCombinations.change(inputtedAmount);
    //
    //   model.put("result", result);
    //   return new ModelAndView(model, layout);
    // }, new VelocityTemplateEngine());
  }


}
