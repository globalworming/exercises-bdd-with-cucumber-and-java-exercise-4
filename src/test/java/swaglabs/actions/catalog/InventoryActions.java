package swaglabs.actions.catalog;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.screenplay.targets.SearchableTarget;
import net.serenitybdd.screenplay.ui.Button;
import net.serenitybdd.screenplay.ui.Link;
import net.serenitybdd.screenplay.ui.PageElement;
import net.thucydides.core.annotations.Step;

public class InventoryActions extends UIInteractionSteps {

    @Step("Add '{0}' to the cart")
    public void addToCart(String item) {
        find(Button.withText("Add to cart").inside(inventoryItemDescriptionFor(item))).click();
    }
    @Step("View product details for '{0}'")
    public void viewDetailsFor(String item) {
        find(Link.withText(item)).click();
    }

    @Step("Remove '{0}' from the cart")
    public void removeFromCart(String item) {
        find(Button.withText("Remove").inside(inventoryItemDescriptionFor(item))).click();
    }

    private SearchableTarget inventoryItemDescriptionFor(String item) {
        return PageElement.locatedBy(".inventory_item_description").containingText(item);
    }
}
