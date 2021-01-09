package com.bunev.sample.step_definitions;

import com.bunev.sample.page.XFashionProductPage;
import io.cucumber.java.en.And;

public class XFashionProductPageSteps {

  private XFashionProductPage xFashionProductPage;

  public XFashionProductPageSteps() {
    this.xFashionProductPage = new XFashionProductPage();
  }

  @And("^I verify that discount is calculated correctly")
  public void checkDiscountCalculation() {
    xFashionProductPage.checkDiscountCalculation();
  }
}
