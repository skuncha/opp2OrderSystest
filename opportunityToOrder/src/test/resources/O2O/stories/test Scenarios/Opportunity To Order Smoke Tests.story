!-- Objective : To create regression pack for Opportunity To Order

Narrative:
In order to Test OpportunityToOrder user journeys
As a Sales Reprasentative
I want to login to SalesforceGlue and able to create opportunities, opportunity lines and orders

Scenario: 1. Sales Executive will be able to create 20 opplines in one go and able to edit opplines

Meta:
@skip
@author Srinivasa Kuncha
@tags feature: OpportunityToOrder

Given Sales Executive is on the Salesfoce Login Page
When  Sales Executive login to glue with valid credentials
When  Sales Executive clicks on 'Accounts' Tab on glue Home page
And   Sales Executive search for an account on Account Search Screen using [searchAccountName]
And   Sales Executive clicks on 'NewAccount' button from search results section
And   Sales Executive selects record type as 'Advertiser' and clicks on 'Continue' button
When  Sales Executive supply input as required to create customer account:
|ElementName 	|ElementValue							|
|accountType	|Direct Advertiser						|
|accountName	|Direct Advertiser						|
|phoneNumber	|020 000000000							|
|billingStreet	|DMGT Street							|
|postCode		|BT60JH									|
And  Sales Executive clicks on 'Save' button
Then Sales Executive should be able to create new customer account successfully
When Sales Executive clicks on 'new Contact' button to create contact record for customer:
|ElementName 	|ElementValue							|
|firstName		|Srini									|
|lastName		|Test									|
|email			|srinivasa.kuncha@mailnewspapers.co.uk	|
Then Sales Executive should be able to create contact successfully
When Sales Executive clicks on edit button to create Industry Category
And  Sales Executive supply input for [mainCategory], [subCategory] and [minorCategory]
And  Sales Executive clicks on Save button
When Sales Executive integrates customer account with CCI
When Sales Executive clicks on 'Opportunity To Order' link to create Opportunity
And  Sales Executive supplies input data from CSV [file] to create Opportunity
Then Sales Executive should be able to create Opportunity successfully
When Sales Executive clicks on 'New Opportunity Line' button to create Opportunity line
And  Sales Executive supplies input data from CSV [file] to create Opportunity Line
Then Sales Executive should be able to create Opportunity Line successfully
When Sales Executive choose to edit opplines
Then Sales Executive should be able to edit successfully successfully

Examples:
|searchAccountName	|mainCategory	|subCategory			|minorCategory				|file														|
|xyz123				|30 - RETAIL	|30.04 - RETAIL GENERAL |30.04.00 - RETAIL GENERAL	|src\main\resources\OpportunityToOrderWith20lines.csv		|

Scenario: 2. Sales Executive will be able to create DATEFLEX order using O2O for a Private Advertiser

Meta:
@author Srinivasa Kuncha
@tags feature: OpportunityToOrder

Given Sales Executive is on the Salesfoce Login Page
When  Sales Executive login to glue with valid credentials
When  Sales Executive clicks on 'Accounts' Tab on glue Home page
And   Sales Executive search for an account on Account Search Screen using [searchAccountName]
And   Sales Executive clicks on 'NewAccount' button from search results section
And   Sales Executive selects record type as 'Advertiser' and clicks on 'Continue' button
When  Sales Executive supply input as required to create customer account:
|ElementName 	|ElementValue							|
|accountType	|Private Advertiser						|
|salutation		|Mr.									|
|firstname		|Srinivasa								|
|accountName	|Private Advertiser						|
|phoneNumber	|020 000000000							|
|billingStreet	|DMGT Street							|
|postCode		|BT60JH									|
And  Sales Executive clicks on 'Save' button
Then Sales Executive should be able to create new customer account successfully
When Sales Executive clicks on 'new Contact' button to create contact record for customer:
|ElementName 	|ElementValue							|
|firstName		|Srini									|
|lastName		|Test									|
|email			|srinivasa.kuncha@mailnewspapers.co.uk	|
Then Sales Executive should be able to create contact successfully
When Sales Executive integrates customer account with CCI
And  Sales Executive clicks on a record under Account Mapping Tab
Then Sales Executive should see customer account mapping details returned from CCI when verified
When Sales Executive clicks on a record under Finance Account Tab
Then Sales Executive should see finance account details
When Sales Executive clicks on 'Opportunity To Order' link to create Opportunity
And  Sales Executive supplies input data from CSV [file] to create Opportunity
Then Sales Executive should be able to create Opportunity successfully
When Sales Executive clicks on 'New Opportunity Line' button to create Opportunity line
And  Sales Executive supplies input data from CSV [file] to create Opportunity Line
Then Sales Executive should be able to create Opportunity Line successfully
When Sales Executive selects 'Opportunity Line(s)' to be converted as an Order
Then Sales Executive should be able to open Order plugin with Opportunity Line details successfully

Examples:
|searchAccountName	|mainCategory	|subCategory			|minorCategory				|file													|
|xyz123				|30 - RETAIL	|30.04 - RETAIL GENERAL |30.04.00 - RETAIL GENERAL	|src\main\resources\OpportunityToOrderDateflex.csv		|

Scenario: 3. Sales Executive will be able to create opportunityToOrder for a customer type Brand and whose parent is Client 

Meta:
@author Srinivasa Kuncha
@tags feature: OpportunityToOrder

Given Sales Executive is on the Salesfoce Login Page
When  Sales Executive login to glue with valid credentials
When  Sales Executive clicks on 'Accounts' Tab on glue Home page
And   Sales Executive search for an account on Account Search Screen using [searchAccountName]
And   Sales Executive clicks on 'NewAccount' button from search results section
And   Sales Executive selects record type as 'Advertiser' and clicks on 'Continue' button
When  Sales Executive supply input as required to create customer account:
|ElementName 	|ElementValue							|
|accountType	|Brand									|
|accountName	|Brand parent Client 					|
|parentaccount	|1456490531653 Client					|
|phoneNumber	|020 000000000							|
|billingStreet	|DMGT Street							|
|postCode		|BT60JH									|
And  Sales Executive clicks on 'Save' button
Then Sales Executive should be able to create new customer account successfully
When Sales Executive clicks on 'new Contact' button to create contact record for customer:
|ElementName 	|ElementValue							|
|firstName		|Srini									|
|lastName		|Test									|
|email			|srinivasa.kuncha@mailnewspapers.co.uk	|
Then Sales Executive should be able to create contact successfully
When Sales Executive clicks on edit button to create Industry Category
And  Sales Executive supply input for [mainCategory], [subCategory] and [minorCategory]
And  Sales Executive clicks on Save button
When Sales Executive integrates customer account with CCI
And  Sales Executive clicks on a record under Account Mapping Tab
Then Sales Executive should see customer account mapping details returned from CCI when verified
When Sales Executive makes Booking Agency association with client
Then Sales Executive should be able to create Agency association with client successfully
When Sales Executive clicks on 'Opportunity To Order' link to create Opportunity
And  Sales Executive supplies input data from CSV [file] to create Opportunity
Then Sales Executive should be able to create Opportunity successfully
When Sales Executive clicks on 'New Opportunity Line' button to create Opportunity line
And  Sales Executive supplies input data from CSV [file] to create Opportunity Line
Then Sales Executive should be able to create Opportunity Line successfully
When Sales Executive selects 'Opportunity Line(s)' to be converted as an Order
Then Sales Executive should be able to open Order plugin with Opportunity Line details successfully
Examples:
|searchAccountName	|mainCategory	|subCategory			|minorCategory				|file											|
|xyz123				|30 - RETAIL	|30.04 - RETAIL GENERAL |30.04.00 - RETAIL GENERAL	|src\main\resources\OpportunityToOrder.csv		|

Scenario: 4. Sales Executive will be able to create opportunityToOrder for a customer type Brand whose parent is Direct Advertiser 

Meta:
@author Srinivasa Kuncha
@tags feature: OpportunityToOrder

Given Sales Executive is on the Salesfoce Login Page
When  Sales Executive login to glue with valid credentials
When  Sales Executive clicks on 'Accounts' Tab on glue Home page
And   Sales Executive search for an account on Account Search Screen using [searchAccountName]
And   Sales Executive clicks on 'NewAccount' button from search results section
And   Sales Executive selects record type as 'Advertiser' and clicks on 'Continue' button
When  Sales Executive supply input as required to create customer account:
|ElementName 	|ElementValue							|
|accountType	|Brand									|
|accountName	|Brand parent DA 						|
|parentaccount	|1456401266481 Direct Advertiser		|
|phoneNumber	|020 000000000							|
|billingStreet	|DMGT Street							|
|postCode		|BT60JH									|
And  Sales Executive clicks on 'Save' button
Then Sales Executive should be able to create new customer account successfully
When Sales Executive clicks on 'new Contact' button to create contact record for customer:
|ElementName 	|ElementValue							|
|firstName		|Srini									|
|lastName		|Test									|
|email			|srinivasa.kuncha@mailnewspapers.co.uk	|
Then Sales Executive should be able to create contact successfully
When Sales Executive clicks on edit button to create Industry Category
And  Sales Executive supply input for [mainCategory], [subCategory] and [minorCategory]
And  Sales Executive clicks on Save button
When Sales Executive integrates customer account with CCI
And  Sales Executive clicks on a record under Account Mapping Tab
Then Sales Executive should see customer account mapping details returned from CCI when verified
When Sales Executive clicks on 'Opportunity To Order' link to create Opportunity
And  Sales Executive supplies input data from CSV [file] to create Opportunity
Then Sales Executive should be able to create Opportunity successfully
When Sales Executive clicks on 'New Opportunity Line' button to create Opportunity line
And  Sales Executive supplies input data from CSV [file] to create Opportunity Line
Then Sales Executive should be able to create Opportunity Line successfully
When Sales Executive selects 'Opportunity Line(s)' to be converted as an Order
Then Sales Executive should be able to open Order plugin with Opportunity Line details successfully
Examples:
|searchAccountName	|mainCategory	|subCategory			|minorCategory				|file											|
|xyz123				|30 - RETAIL	|30.04 - RETAIL GENERAL |30.04.00 - RETAIL GENERAL	|src\main\resources\OpportunityToOrder.csv		|

Scenario: 5. Sales Executive will be able to create opportunityToOrder for a Charity Advertiser

Meta:
@author Srinivasa Kuncha
@tags feature: OpportunityToOrder

Given Sales Executive is on the Salesfoce Login Page
When  Sales Executive login to glue with valid credentials
When  Sales Executive clicks on 'Accounts' Tab on glue Home page
And   Sales Executive search for an account on Account Search Screen using [searchAccountName]
And   Sales Executive clicks on 'NewAccount' button from search results section
And   Sales Executive selects record type as 'Advertiser' and clicks on 'Continue' button
When  Sales Executive supply input as required to create customer account:
|ElementName 	|ElementValue							|
|accountType	|Charity								|
|accountName	|Charity 								|
|phoneNumber	|020 000000000							|
|billingStreet	|DMGT Street							|
|postCode		|BT60JH									|
And  Sales Executive clicks on 'Save' button
Then Sales Executive should be able to create new customer account successfully
When Sales Executive clicks on 'new Contact' button to create contact record for customer:
|ElementName 	|ElementValue							|
|firstName		|Srini									|
|lastName		|Test									|
|email			|srinivasa.kuncha@mailnewspapers.co.uk	|
Then Sales Executive should be able to create contact successfully
When Sales Executive clicks on edit button to create Industry Category
And  Sales Executive supply input for [mainCategory], [subCategory] and [minorCategory]
And  Sales Executive clicks on Save button
When Sales Executive integrates customer account with CCI
And  Sales Executive clicks on a record under Account Mapping Tab
Then Sales Executive should see customer account mapping details returned from CCI when verified
When Sales Executive clicks on a record under Finance Account Tab
Then Sales Executive should see finance account details
When Sales Executive clicks on 'Opportunity To Order' link to create Opportunity
And  Sales Executive supplies input data from CSV [file] to create Opportunity
Then Sales Executive should be able to create Opportunity successfully
When Sales Executive clicks on 'New Opportunity Line' button to create Opportunity line
And  Sales Executive supplies input data from CSV [file] to create Opportunity Line
Then Sales Executive should be able to create Opportunity Line successfully
When Sales Executive selects 'Opportunity Line(s)' to be converted as an Order
Then Sales Executive should be able to open Order plugin with Opportunity Line details successfully
Examples:
|searchAccountName	|mainCategory	|subCategory			|minorCategory				|file											|
|xyz123				|30 - RETAIL	|30.04 - RETAIL GENERAL |30.04.00 - RETAIL GENERAL	|src\main\resources\OpportunityToOrder.csv		|

Scenario: 6. Sales Executive will be able to create opportunityToOrder for a Direct Advertiser

Meta:
@author Srinivasa Kuncha
@tags feature: OpportunityToOrder

Given Sales Executive is on the Salesfoce Login Page
When  Sales Executive login to glue with valid credentials
When  Sales Executive clicks on 'Accounts' Tab on glue Home page
And   Sales Executive search for an account on Account Search Screen using [searchAccountName]
And   Sales Executive clicks on 'NewAccount' button from search results section
And   Sales Executive selects record type as 'Advertiser' and clicks on 'Continue' button
When  Sales Executive supply input as required to create customer account:
|ElementName 	|ElementValue							|
|accountType	|Direct Advertiser						|
|accountName	|Direct Advertiser 						|
|phoneNumber	|020 000000000							|
|billingStreet	|DMGT Street							|
|postCode		|BT60JH									|
And  Sales Executive clicks on 'Save' button
Then Sales Executive should be able to create new customer account successfully
When Sales Executive clicks on 'new Contact' button to create contact record for customer:
|ElementName 	|ElementValue							|
|firstName		|Srini									|
|lastName		|Test									|
|email			|srinivasa.kuncha@mailnewspapers.co.uk	|
Then Sales Executive should be able to create contact successfully
When Sales Executive clicks on edit button to create Industry Category
And  Sales Executive supply input for [mainCategory], [subCategory] and [minorCategory]
And  Sales Executive clicks on Save button
When Sales Executive integrates customer account with CCI
And  Sales Executive clicks on a record under Account Mapping Tab
Then Sales Executive should see customer account mapping details returned from CCI when verified
When Sales Executive clicks on a record under Finance Account Tab
Then Sales Executive should see finance account details
When Sales Executive clicks on 'Opportunity To Order' link to create Opportunity
And  Sales Executive supplies input data from CSV [file] to create Opportunity
Then Sales Executive should be able to create Opportunity successfully
When Sales Executive clicks on 'New Opportunity Line' button to create Opportunity line
And  Sales Executive supplies input data from CSV [file] to create Opportunity Line
Then Sales Executive should be able to create Opportunity Line successfully
When Sales Executive selects 'Opportunity Line(s)' to be converted as an Order
Then Sales Executive should be able to open Order plugin with Opportunity Line details successfully
Examples:
|searchAccountName	|mainCategory	|subCategory			|minorCategory				|file											|
|xyz123				|30 - RETAIL	|30.04 - RETAIL GENERAL |30.04.00 - RETAIL GENERAL	|src\main\resources\OpportunityToOrder.csv		|

Scenario: 7. Sales Executive will be able to create opportunityToOrder for a Private Advertiser

Meta:
@author Srinivasa Kuncha
@tags feature: OpportunityToOrder

Given Sales Executive is on the Salesfoce Login Page
When  Sales Executive login to glue with valid credentials
When  Sales Executive clicks on 'Accounts' Tab on glue Home page
And   Sales Executive search for an account on Account Search Screen using [searchAccountName]
And   Sales Executive clicks on 'NewAccount' button from search results section
And   Sales Executive selects record type as 'Advertiser' and clicks on 'Continue' button
When  Sales Executive supply input as required to create customer account:
|ElementName 	|ElementValue							|
|accountType	|Private Advertiser						|
|salutation		|Mr.									|
|firstname		|Srinivasa								|
|accountName	|Private Advertiser						|
|phoneNumber	|020 000000000							|
|billingStreet	|DMGT Street							|
|postCode		|BT60JH									|
And  Sales Executive clicks on 'Save' button
Then Sales Executive should be able to create new customer account successfully
When Sales Executive clicks on 'new Contact' button to create contact record for customer:
|ElementName 	|ElementValue							|
|firstName		|Srini									|
|lastName		|Test									|
|email			|srinivasa.kuncha@mailnewspapers.co.uk	|
Then Sales Executive should be able to create contact successfully
When Sales Executive integrates customer account with CCI
And  Sales Executive clicks on a record under Account Mapping Tab
Then Sales Executive should see customer account mapping details returned from CCI when verified
When Sales Executive clicks on a record under Finance Account Tab
Then Sales Executive should see finance account details
When Sales Executive clicks on 'Opportunity To Order' link to create Opportunity
And  Sales Executive supplies input data from CSV [file] to create Opportunity
Then Sales Executive should be able to create Opportunity successfully
When Sales Executive clicks on 'New Opportunity Line' button to create Opportunity line
And  Sales Executive supplies input data from CSV [file] to create Opportunity Line
Then Sales Executive should be able to create Opportunity Line successfully
When Sales Executive selects 'Opportunity Line(s)' to be converted as an Order
Then Sales Executive should be able to open Order plugin with Opportunity Line details successfully
Examples:
|searchAccountName	|file											|
|xyz123				|src\main\resources\OpportunityToOrder.csv		|

Scenario: 8. Sales Executive will be able to create opportunityToOrder for a Client

Meta:
@author Srinivasa Kuncha
@tags feature: OpportunityToOrder

Given Sales Executive is on the Salesfoce Login Page
When  Sales Executive login to glue with valid credentials
When  Sales Executive clicks on 'Accounts' Tab on glue Home page
And   Sales Executive search for an account on Account Search Screen using [searchAccountName]
And   Sales Executive clicks on 'NewAccount' button from search results section
And   Sales Executive selects record type as 'Advertiser' and clicks on 'Continue' button
When  Sales Executive supply input as required to create customer account:
|ElementName 	|ElementValue							|
|accountType	|Client									|
|accountName	|Client 								|
|phoneNumber	|020 000000000							|
|billingStreet	|DMGT Street							|
|postCode		|BT60JH									|
And  Sales Executive clicks on 'Save' button
Then Sales Executive should be able to create new customer account successfully
When Sales Executive clicks on 'new Contact' button to create contact record for customer:
|ElementName 	|ElementValue							|
|firstName		|Srini									|
|lastName		|Test									|
|email			|srinivasa.kuncha@mailnewspapers.co.uk	|
Then Sales Executive should be able to create contact successfully
When Sales Executive clicks on edit button to create Industry Category
And  Sales Executive supply input for [mainCategory], [subCategory] and [minorCategory]
And  Sales Executive clicks on Save button
When Sales Executive integrates customer account with CCI
And  Sales Executive clicks on a record under Account Mapping Tab
Then Sales Executive should see customer account mapping details returned from CCI when verified
When Sales Executive makes Booking Agency association with client
Then Sales Executive should be able to create Agency association with client successfully
When Sales Executive clicks on 'Opportunity To Order' link to create Opportunity
And  Sales Executive supplies input data from CSV [file] to create Opportunity
Then Sales Executive should be able to create Opportunity successfully
When Sales Executive clicks on 'New Opportunity Line' button to create Opportunity line
And  Sales Executive supplies input data from CSV [file] to create Opportunity Line
Then Sales Executive should be able to create Opportunity Line successfully
When Sales Executive selects 'Opportunity Line(s)' to be converted as an Order
Then Sales Executive should be able to open Order plugin with Opportunity Line details successfully
Examples:
|searchAccountName	|mainCategory	|subCategory			|minorCategory				|file											|
|xyz123				|30 - RETAIL	|30.04 - RETAIL GENERAL |30.04.00 - RETAIL GENERAL	|src\main\resources\OpportunityToOrder.csv		|

Scenario: 9. Sales Executive will be able to see non converted opplines moved to Deactivated table when opp status changed as ClosedWon 

Meta:
@author Srinivasa Kuncha
@tags feature: OpportunityToOrder

Given Sales Executive is on the Salesfoce Login Page
When  Sales Executive login to glue with valid credentials
When  Sales Executive clicks on 'Accounts' Tab on glue Home page
And   Sales Executive search for an account on Account Search Screen using [searchAccountName]
And   Sales Executive clicks on 'NewAccount' button from search results section
And   Sales Executive selects record type as 'Advertiser' and clicks on 'Continue' button
When  Sales Executive supply input as required to create customer account:
|ElementName 	|ElementValue							|
|accountType	|Direct Advertiser						|
|accountName	|Direct Advertiser 						|
|phoneNumber	|020 000000000							|
|billingStreet	|DMGT Street							|
|postCode		|BT60JH									|
And  Sales Executive clicks on 'Save' button
Then Sales Executive should be able to create new customer account successfully
When Sales Executive clicks on 'new Contact' button to create contact record for customer:
|ElementName 	|ElementValue							|
|firstName		|Srini									|
|lastName		|Test									|
|email			|srinivasa.kuncha@mailnewspapers.co.uk	|
Then Sales Executive should be able to create contact successfully
When Sales Executive clicks on edit button to create Industry Category
And  Sales Executive supply input for [mainCategory], [subCategory] and [minorCategory]
And  Sales Executive clicks on Save button
When Sales Executive integrates customer account with CCI
When Sales Executive clicks on 'Opportunity To Order' link to create Opportunity
And  Sales Executive supplies input data from CSV [file] to create Opportunity
Then Sales Executive should be able to create Opportunity successfully
When Sales Executive clicks on 'New Opportunity Line' button to create Opportunity line
And  Sales Executive supplies input data from CSV [file] to create Opportunity Line
Then Sales Executive should be able to create Opportunity Line successfully
When Sales Executive should be able to changes opportunity stage as Close Won and save
Then Sales Executive should see opportunity stage changed to Closed Won successfully

Examples:
|searchAccountName	|mainCategory	|subCategory			|minorCategory				|file											|
|xyz123				|30 - RETAIL	|30.04 - RETAIL GENERAL |30.04.00 - RETAIL GENERAL	|src\main\resources\OpportunityToOrder.csv		|

Scenario: 10. Sales Executive will be able to create opportunityToOrder and change the opp status as ClosedWon

Meta:
@author Srinivasa Kuncha
@tags feature: OpportunityToOrder

Given Sales Executive is on the Salesfoce Login Page
When  Sales Executive login to glue with valid credentials
When  Sales Executive clicks on 'Accounts' Tab on glue Home page
And   Sales Executive search for an account on Account Search Screen using [searchAccountName]
And   Sales Executive clicks on 'NewAccount' button from search results section
And   Sales Executive selects record type as 'Advertiser' and clicks on 'Continue' button
When  Sales Executive supply input as required to create customer account:
|ElementName 	|ElementValue							|
|accountType	|Direct Advertiser						|
|accountName	|Direct Advertiser 						|
|phoneNumber	|020 000000000							|
|billingStreet	|DMGT Street							|
|postCode		|BT60JH									|
And  Sales Executive clicks on 'Save' button
Then Sales Executive should be able to create new customer account successfully
When Sales Executive clicks on 'new Contact' button to create contact record for customer:
|ElementName 	|ElementValue							|
|firstName		|Srini									|
|lastName		|Test									|
|email			|srinivasa.kuncha@mailnewspapers.co.uk	|
Then Sales Executive should be able to create contact successfully
When Sales Executive clicks on edit button to create Industry Category
And  Sales Executive supply input for [mainCategory], [subCategory] and [minorCategory]
And  Sales Executive clicks on Save button
When Sales Executive integrates customer account with CCI
When Sales Executive clicks on 'Opportunity To Order' link to create Opportunity
And  Sales Executive supplies input data from CSV [file] to create Opportunity
Then Sales Executive should be able to create Opportunity successfully
When Sales Executive clicks on 'New Opportunity Line' button to create Opportunity line
And  Sales Executive supplies input data from CSV [file] to create Opportunity Line
Then Sales Executive should be able to create Opportunity Line successfully
When Sales Executive selects 'Opportunity Line(s)' to be converted as an Order
Then Sales Executive should be able to open Order plugin with Opportunity Line details successfully
When Sales Executive should be able to changes opportunity stage as Close Won and save
Then Sales Executive should see opportunity stage changed to Closed Won successfully

Examples:
|searchAccountName	|mainCategory	|subCategory			|minorCategory				|file											|
|xyz123				|30 - RETAIL	|30.04 - RETAIL GENERAL |30.04.00 - RETAIL GENERAL	|src\main\resources\OpportunityToOrder.csv		|


Scenario: 11. Sales Executive will be able to cancel an oppline

Meta:
@author Srinivasa Kuncha
@tags feature: OpportunityToOrder

Given Sales Executive is on the Salesfoce Login Page
When  Sales Executive login to glue with valid credentials
When  Sales Executive clicks on 'Accounts' Tab on glue Home page
And   Sales Executive search for an account on Account Search Screen using [searchAccountName]
And   Sales Executive clicks on 'NewAccount' button from search results section
And   Sales Executive selects record type as 'Advertiser' and clicks on 'Continue' button
When  Sales Executive supply input as required to create customer account:
|ElementName 	|ElementValue							|
|accountType	|Private Advertiser						|
|salutation		|Mr.									|
|firstname		|Srinivasa								|
|accountName	|Private Advertiser						|
|phoneNumber	|020 000000000							|
|billingStreet	|DMGT Street							|
|postCode		|BT60JH									|
And  Sales Executive clicks on 'Save' button
Then Sales Executive should be able to create new customer account successfully
When Sales Executive clicks on 'new Contact' button to create contact record for customer:
|ElementName 	|ElementValue							|
|firstName		|Srini									|
|lastName		|Test									|
|email			|srinivasa.kuncha@mailnewspapers.co.uk	|
Then Sales Executive should be able to create contact successfully
When Sales Executive integrates customer account with CCI
When Sales Executive clicks on 'Opportunity To Order' link to create Opportunity
And  Sales Executive supplies input data from CSV [file] to create Opportunity
Then Sales Executive should be able to create Opportunity successfully
When Sales Executive clicks on 'New Opportunity Line' button to create Opportunity line
And  Sales Executive supplies input data from CSV [file] to create Opportunity Line
Then Sales Executive should be able to create Opportunity Line successfully
When Sales Executive wish to deactivate Oppline
Then Sales Executive should be able to deactivate Oppline successfully

Examples:
|searchAccountName	|file														|
|xyz123				|src\main\resources\OpportunityToOrderSingleLine.csv		|

Scenario: 12. Sales Executive will be able to cancel an order line

Meta:
@author Srinivasa Kuncha
@tags feature: OpportunityToOrder

Given Sales Executive is on the Salesfoce Login Page
When  Sales Executive login to glue with valid credentials
When  Sales Executive clicks on 'Accounts' Tab on glue Home page
And   Sales Executive search for an account on Account Search Screen using [searchAccountName]
And   Sales Executive clicks on 'NewAccount' button from search results section
And   Sales Executive selects record type as 'Advertiser' and clicks on 'Continue' button
When  Sales Executive supply input as required to create customer account:
|ElementName 	|ElementValue							|
|accountType	|Private Advertiser						|
|salutation		|Mr.									|
|firstname		|Srinivasa								|
|accountName	|Private Advertiser						|
|phoneNumber	|020 000000000							|
|billingStreet	|DMGT Street							|
|postCode		|BT60JH									|
And  Sales Executive clicks on 'Save' button
Then Sales Executive should be able to create new customer account successfully
When Sales Executive clicks on 'new Contact' button to create contact record for customer:
|ElementName 	|ElementValue							|
|firstName		|Srini									|
|lastName		|Test									|
|email			|srinivasa.kuncha@mailnewspapers.co.uk	|
Then Sales Executive should be able to create contact successfully
When Sales Executive integrates customer account with CCI
When Sales Executive clicks on 'Opportunity To Order' link to create Opportunity
And  Sales Executive supplies input data from CSV [file] to create Opportunity
Then Sales Executive should be able to create Opportunity successfully
When Sales Executive clicks on 'New Opportunity Line' button to create Opportunity line
And  Sales Executive supplies input data from CSV [file] to create Opportunity Line
Then Sales Executive should be able to create Opportunity Line successfully
When Sales Executive selects 'Opportunity Line(s)' to be converted as an Order
Then Sales Executive should be able to open Order plugin with Opportunity Line details successfully
When When Sales Executive wish to cancel Order line
Then Sales Executive should see line status as cancelled and price on it becomes zero

Examples:
|searchAccountName	|file														|
|xyz123				|src\main\resources\OpportunityToOrderSingleLine.csv		|