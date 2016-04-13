!--  srinivasa.kuncha@mailnewspapers.co.uk.mailonline.systemtest
!--  srinivasa.kuncha@mailnewspapers.co.uk.mail.systemtest

Scenario: 1. Sales Executive will be able to create Opportunity to Digital line 

Meta:
@skip
@ignored true
@author Srinivasa Kuncha
@tags feature: OpportunityToDigital

Given Sales Executive is on the Salesfoce Login Page
When  Sales Executive login to glue with digital user credentials
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
When Sales Executive clicks on 'Opportunity To Order' link to create Opportunity
And  Sales Executive supplies input data from CSV [file] to create Opportunity
Then Sales Executive should be able to create Opportunity successfully
When Sales Executive clicks on 'Add Digital Products' button to create Digital Lines
And  Sales Executive supplies input to create Digital Lines
Then Sales Executive should be able to create Digital Lines successfully
Examples:
|searchAccountName	|file											|
|xyz123				|src\main\resources\OpportunityToOrder.csv		|

Scenario: 2. Sales Executive will be able to edit Opportunity to Digital line 

Meta:
@author Srinivasa Kuncha
@tags feature: OpportunityToDigital

Given Sales Executive is on the Salesfoce Login Page
When  Sales Executive login to glue with digital user credentials
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
When Sales Executive clicks on 'Opportunity To Order' link to create Opportunity
And  Sales Executive supplies input data from CSV [file] to create Opportunity
Then Sales Executive should be able to create Opportunity successfully
When Sales Executive clicks on 'Add Digital Products' button to create Digital Lines
And  Sales Executive supplies input to create Digital Lines
Then Sales Executive should be able to create Digital Lines successfully
Then Sales Executive should be able to update line description on the Digital Line
Examples:
|searchAccountName	|file											|
|xyz123				|src\main\resources\OpportunityToOrder.csv		|

Scenario: 3. Sales Executive will be able to create new line using copy functionality

Meta:
@author Srinivasa Kuncha
@tags feature: OpportunityToDigital

Given Sales Executive is on the Salesfoce Login Page
When  Sales Executive login to glue with digital user credentials
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
When Sales Executive clicks on 'Opportunity To Order' link to create Opportunity
And  Sales Executive supplies input data from CSV [file] to create Opportunity
Then Sales Executive should be able to create Opportunity successfully
When Sales Executive clicks on 'Add Digital Products' button to create Digital Lines
And  Sales Executive supplies input to create Digital Lines
Then Sales Executive should be able to create Digital Lines successfully
Then Sales Executive should be able to create new line using copy functionality

Examples:
|searchAccountName	|file											|
|xyz123				|src\main\resources\OpportunityToOrder.csv		|

Scenario: 4. Sales Executive will be able to copy start and end dates as same on all lines using copydates function
Meta:
@author Srinivasa Kuncha
@tags feature: OpportunityToDigital

Given Sales Executive is on the Salesfoce Login Page
When  Sales Executive login to glue with digital user credentials
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
When Sales Executive clicks on 'Opportunity To Order' link to create Opportunity
And  Sales Executive supplies input data from CSV [file] to create Opportunity
Then Sales Executive should be able to create Opportunity successfully
When Sales Executive clicks on 'Add Digital Products' button to create Digital Lines
And  Sales Executive supplies input to create Digital Lines
Then Sales Executive should be able to create Digital Lines successfully
Then Sales Executive should be able to copydates on '2' new lines copied from existing line

Examples:
|searchAccountName	|file											|
|xyz123				|src\main\resources\OpportunityToOrder.csv		|

Scenario: 5. Sales Executive will be able to create Opportunity from the selected Digital lines 

Meta:
@author Srinivasa Kuncha
@tags feature: OpportunityToDigital

Given Sales Executive is on the Salesfoce Login Page
When  Sales Executive login to glue with digital user credentials
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
When Sales Executive clicks on 'Opportunity To Order' link to create Opportunity
And  Sales Executive supplies input data from CSV [file] to create Opportunity
Then Sales Executive should be able to create Opportunity successfully
When Sales Executive clicks on 'Add Digital Products' button to create Digital Lines
And  Sales Executive supplies input to create Digital Lines
Then Sales Executive should be able to create Digital Lines successfully
Then Sales Executive selects the Digital Line and create new Opportunity using those lines
Examples:
|searchAccountName	|file											|
|xyz123				|src\main\resources\OpportunityToOrder.csv		|

Scenario: 6. Sales Executive will be able to de-activate Opportunity to Digital line 

Meta:
@author Srinivasa Kuncha
@tags feature: OpportunityToDigital

Given Sales Executive is on the Salesfoce Login Page
When  Sales Executive login to glue with digital user credentials
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
When Sales Executive clicks on 'Opportunity To Order' link to create Opportunity
And  Sales Executive supplies input data from CSV [file] to create Opportunity
Then Sales Executive should be able to create Opportunity successfully
When Sales Executive clicks on 'Add Digital Products' button to create Digital Lines
And  Sales Executive supplies input to create Digital Lines
Then Sales Executive should be able to create Digital Lines successfully
Then Sales Executive should be able to deactivate Digital Line
Examples:
|searchAccountName	|file											|
|xyz123				|src\main\resources\OpportunityToOrder.csv		|

Scenario: 7. Sales Executive will be able to set the Oppoutunity Stage as Closed Won when opp has Digital lines 

Meta:
@author Srinivasa Kuncha
@tags feature: OpportunityToDigital

Given Sales Executive is on the Salesfoce Login Page
When  Sales Executive login to glue with digital user credentials
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
When Sales Executive clicks on 'New Account Mapping' link and creates accoutMapping
When Sales Executive clicks on 'new Contact' button to create contact record for customer:
|ElementName 	|ElementValue							|
|firstName		|Srini									|
|lastName		|Test									|
|email			|srinivasa.kuncha@mailnewspapers.co.uk	|
Then Sales Executive should be able to create contact successfully
When Sales Executive clicks on 'Opportunity To Order' link to create Opportunity
And  Sales Executive supplies input data from CSV [file] to create Opportunity
Then Sales Executive should be able to create Opportunity successfully
When Sales Executive clicks on 'Add Digital Products' button to create Digital Lines
And  Sales Executive supplies input to create Digital Lines
Then Sales Executive should be able to create Digital Lines successfully
When Sales Executive should be able to changes opportunity stage as Close Won and save
Then Sales Executive should see opportunity stage changed to Closed Won successfully
Then Sales Executive should be shown error message as [error] when try to add new digital line

Examples:
|searchAccountName	|file											|error										 	|
|xyz123				|src\main\resources\OpportunityToOrder.csv		|Lines can not be added to closed opportunity.	|

Scenario: 8. Sales Executive will be able to set the Oppoutunity Stage as Closed Lost when opp has Digital lines 

Meta:
@author Srinivasa Kuncha
@tags feature: OpportunityToDigital

Given Sales Executive is on the Salesfoce Login Page
When  Sales Executive login to glue with digital user credentials
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
When Sales Executive clicks on 'New Account Mapping' link and creates accoutMapping
When Sales Executive clicks on 'new Contact' button to create contact record for customer:
|ElementName 	|ElementValue							|
|firstName		|Srini									|
|lastName		|Test									|
|email			|srinivasa.kuncha@mailnewspapers.co.uk	|
Then Sales Executive should be able to create contact successfully
When Sales Executive clicks on 'Opportunity To Order' link to create Opportunity
And  Sales Executive supplies input data from CSV [file] to create Opportunity
Then Sales Executive should be able to create Opportunity successfully
When Sales Executive clicks on 'Add Digital Products' button to create Digital Lines
And  Sales Executive supplies input to create Digital Lines
Then Sales Executive should be able to create Digital Lines successfully
When Sales Executive should be able to changes opportunity stage as Close Lost and save
Then Sales Executive should see opportunity stage changed to Closed Lost successfully
Then Sales Executive should be shown error message as [error] when try to add new digital line

Examples:
|searchAccountName	|file											|error										 	|
|xyz123				|src\main\resources\OpportunityToOrder.csv		|Lines can not be added to closed opportunity.	|

