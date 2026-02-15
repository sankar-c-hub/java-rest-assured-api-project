Feature: Pet Store Server based on the OpenAPI 3.0 specification

  @Update_Pet_Api @test001
  Scenario Outline: Update pet details in the system
    Given I have access to API URL
    When I set API endpoint in Update pet API as '<URL>'
    And I set API Method in Update pet API as 'post'
    And I set API Request in Update pet API as '<api request>'
    And I set API Headers in Update pet API as '<api header>'
    Then execute API and verify in Update pet API as '<api output>'

    Examples: 
      | SlNo. | URL                    | api request                | api header                | api output                  |
      |     1 | Petstore_UpdatePet_URL | Petstore_UpdatePet_Request | Petstore_UpdatePet_Header | Petstore_UpdatePet_Response |

  #Total No. of Test Cases : 1
  @Petstore_UpdatePet @test002
  Scenario Outline: Update a pet in the Petstore API
    Given I have access to API URL
    When I set API endpoint as '<URL>'
    And I set API Method as '<Method>'
    And I set API Request Body as '<RequestBody>'
    And I set API Headers as '<Headers>'
    Then I execute API request and verify response as '<ExpectedStatusCode>'

    Examples: 
      | SlNo | URL               | Method             | RequestBody           | Headers               | ExpectedStatusCode     |
      |    1 | Petstore_post_url | Petstore_post_type | Petstore_post_Request | Petstore_post_headers | Petstore_post_Response |

  #Total No. of Test Cases : 2
  @Order_Density_api_api_3 @test003
  Scenario Outline: Get pets by their availability status
    Given I have access to API URL
    When I set API endpoint in Order Density api as '<URL>'
    And I set API Method as 'get'
    And I set API Headers as '<api header>'
    And I set API Parameter in Order Density api as '<api parameter type>'
    Then execute API and verify in Order Density api as '<api output>'

    Examples: 
      | SlNo. | URL               | api header              | api parameter type             | api output              |
      |     1 | Order_Density_URL | Order_Density_apiheader | Order_Density_apiparametertype | Order_Density_apioutput |

  #Total No. of Test Cases : 3
  @Get_orders_in_the_inflight_tab_api_api_4 @test004 @Orders
  Scenario Outline: Get the order in the Toread Tab
    Given I have access to API URL
    When I set API endpoint in Order Density api as '<URL>'
    And I set API Method as 'get'
    And I set API Headers as '<api header>'
    And I set API Parameter in Order Density api as '<api parameter type>'
    Then execute API and verify in Get orders in the inflight tab api as '<api output>'

    Examples: 
      | SlNo. | URL                | api header              | api parameter type              | api output              |
      |     1 | Order_Density_URL4 | Order_Density_apiheader | Order_Density_apiparametertype4 | Order_Density_apioutput |

  #Total No. of Test Cases : 4
  @Get_pet_details_api @test005 @PetStore
  Scenario Outline: Get pet details from the Petstore API
    Given I have access to API URL
    When I set API endpoint in Get pet details API as '<URL>'
    And I set API Method in Get pet details API as 'GET'
    And I set API Headers in Get pet details API as '<api header>'
    And I set API Parameter in Get pet details API as '<api parameter type>'
    Then execute API and verify in Get pet details API as '<api output>'

    Examples: 
      | SlNo. | URL                              | api header              | api parameter type                            | api output                             |
      |     1 | Get_order_in_assure_response_URL | Order_Density_apiheader | Get_order_in_assure_response_apiparametertype | Get_order_in_assure_response_apioutput |

  #Total No. of Test Cases : 5
  @Get_order_in_assure_Safeguard_api_api_6 @test006
  Scenario Outline: Fetch order details from Assure Safeguard API
    Given I have access to API URL
    When I set the API endpoint to fetch order details as '<URL>'
    And I specify the request method as 'POST'
    And I add the required request headers '<api header>'
    And I include query parameters in the request '<api parameter type>'
    Then I execute the request and validate the response for Assure Safeguard API '<api output>'

    Examples: 
      | SlNo. | URL                           | api header              | api parameter type                         | api output                          |
      |     1 | Get_orders_in_pending_tab_URL | Order_Density_apiheader | Get_orders_in_pending_tab_apiparametertype | Get_orders_in_pending_tab_apioutput |
#Total No. of Test Cases : 6
