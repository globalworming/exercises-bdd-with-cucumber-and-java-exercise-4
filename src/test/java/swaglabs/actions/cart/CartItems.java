package swaglabs.actions.cart;

import net.serenitybdd.core.steps.UIQuerySteps;

import java.util.List;

public class CartItems extends UIQuerySteps {
    public List<String> itemNames() {
        return findAll(".inventory_item_name").texts();
    }
}
