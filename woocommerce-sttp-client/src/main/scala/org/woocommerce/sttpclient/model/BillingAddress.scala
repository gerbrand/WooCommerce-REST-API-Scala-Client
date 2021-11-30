/**
 * wc/store
 * OpenAPI document of the namespace wc/store. Based on generated json document, with some changes and additions
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.woocommerce.sttpclient.model


  /**
   * Billing address.
   */
case class BillingAddress(
  /* First name */
  firstName: String,
  /* Last name */
  lastName: String,
  /* Company */
  company: String,
  /* Address */
  address1: String,
  /* Apartment, suite, etc. */
  address2: String,
  /* City */
  city: String,
  /* State/County code, or name of the state, county, province, or district. */
  state: String,
  /* Postal code */
  postcode: String,
  /* Country/Region code in ISO 3166-1 alpha-2 format. */
  country: String,
  /* Phone */
  phone: String,
  /* Email */
  email: String
)

