Feature: Evaluate percentage

  Scenario: Verify 10% offer
    Given Execute GetDiscountService Business
    When if I will enter 5001
    Then We should get ten percentage discount

  Scenario: Verify 15% offer
    Given Execute GetDiscountService Business
    When if I will enter 11000
    Then We should get fifteen percentage discount

  Scenario: Verify No offer
    Given Execute GetDiscountService Business
    When if I will enter 4000
    Then We shouldn't get any percentage
