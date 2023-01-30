package com.freeunitconverter.pages;

import com.freeunitconverter.constants.Constants;
import io.qameta.allure.Step;
import org.assertj.core.api.SoftAssertions;

import java.lang.reflect.ParameterizedType;

import static com.freeunitconverter.helpers.WebElementHelpers.swipeElement;

public interface IGeneral {

    @Step("swipeValueDown")
    default <T extends BasePage> T swipeValueDown() throws InstantiationException, IllegalAccessException, ClassCastException {
        swipeElement(new MainPage().valueSelector, Constants.Direction.DOWN);

        return (T) ((Class) ((ParameterizedType) this.getClass().
                getGenericSuperclass()).getActualTypeArguments()[0]).newInstance();
    }

    @Step("verifyPageValueElements")
    default void verifyPageValueElements(SoftAssertions softAssertions) {
    }
}