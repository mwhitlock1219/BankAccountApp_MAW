Project 3

## Bank Application

#### Senario:

- You are a back-end developer and need to create an application to handle new customer bank account requests.

## Your application should do the following:

- Read a .cvs file of names, SSNs, account type ad initial deposit
- Use a proper data structure to hold all these accounts
- Both savings and checking accoounts share the following properties

  - deposit()
  - withdraw()
  - trandfer()
  - showinfo()

    _11-Digit Account Number(generated with the following process: 1 or 2 depending on Savings or checking, last two digits of SSN, unique 5-digit number, and random 3-digit number)_

- SavingAccount holders are given a Safety Deposit box, Identified by a 3-digit number and accessed with a 4-digit code
- Checking Account holders are assigned a Debit card with a 12-digit number and 4 digit PIN
- Both accounts use an interface that determines the base interest rate.
  _savings accounts will use .25 points less than the base rate_
  _checking acounts will use 15% of the base rate_
- The showInfo method should reveal relevant account information as well as information specific to th eChecking /Saving account.
