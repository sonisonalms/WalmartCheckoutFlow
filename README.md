# WalmartCheckoutFlow

Problem: Automate an end to end user e-commerce transaction flow using any open source tool for mobile.walmart.com http://mobile.walmart.com with an existing customer on chrome or safari browser.

I have used selenium webdriver to automate the flow. I have used Page Object Model to design the automation for the checkout flow.

Please run the code using cmd

mvn clean install -Dwebdriver.chrome.driver=chromedriver

Test case is located in file - src/test/java/TestCases/walmartFlowTest.java

Page Classes is located @ - src/test/java/PageClasses

Technical Debts in the code

CartPage has elements only to support single item in cart, if you add more than one item the cartPage cannot handle it. - Given more time I would like to fix it.
CheckoutPage - does not contain any kid of validation.
Product search page selects the first item by default.

I will assert more items in future.
