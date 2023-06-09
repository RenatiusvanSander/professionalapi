package edu.remad.professionalapi.api.controllers;

import edu.remad.professionalapi.api.exceptions.Error;
import edu.remad.professionalapi.api.exceptions.ErrorCode;
import edu.remad.professionalapi.api.exceptions.ErrorUtils;
import edu.remad.professionalapi.api.exceptions.MyErrorException;
import edu.remad.professionalapi.handler.CartApi;
import edu.remad.professionalapi.model.Cart;
import edu.remad.professionalapi.model.Item;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carts")
public class CartsController extends CartApi {
  private static final Logger log = LoggerFactory.getLogger(CartsController.class);

  @Override
  public List<Item> addCartItemsByCustomerId(String customerId, @Valid Item item) {
    log.info(String.format("Request for customer ID: %s\nItem: %s", customerId, item));

    return new ArrayList<>();
  }

  /**
   * Gets customer's cart.
   *
   * @param customerId Customer Identifier (required)
   * @return the customer's cart
   */
  @Override
  @GetMapping("/{customerId}")
  public List<Cart> getCartByCustomerId(@PathVariable String customerId) {
    /*Cart cart = new Cart();
    cart.setCustomerId("23");
    return List.of(cart);*/

    Error manualError = ErrorUtils.createError("Internal Server Error", ErrorCode.INTERNAL_SERVER_ERROR,500, "api");
    MyErrorException exception = new MyErrorException();
    exception.setError(manualError);

    throw exception;
  }

  // Other method implementations (omitted)
}
