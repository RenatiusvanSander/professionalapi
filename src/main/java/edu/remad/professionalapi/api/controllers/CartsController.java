package edu.remad.professionalapi.api.controllers;

import edu.remad.professionalapi.handler.CartApi;
import edu.remad.professionalapi.model.Cart;
import edu.remad.professionalapi.model.Item;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CartsController extends CartApi {
  private static final Logger log = LoggerFactory.getLogger(CartsController.class);

  @Override
  public List<Item> addCartItemsByCustomerId(String customerId, @Valid Item item) {
    log.info("Request for customer ID: {}\nItem: {}", customerId, item);

    return new ArrayList<>();
  }

  @Override
  public List<Cart> getCartByCustomerId(String customerId) {
    throw new RuntimeException("Manual Exception thrown");

  }

  // Other method implementations (omitted)
}
