# Java-ATM-MAchine

# ATM Machine Simulation in Java

## Overview
This Java program simulates a simple ATM (Automated Teller Machine) system where users can check their balance, withdraw money, deposit money, and exit the system. The user needs to enter the correct PIN to access the ATM functionalities.

## Features
- PIN authentication for security.
- Menu-driven interface for user-friendly interaction.
- Check account balance.
- Withdraw money (with insufficient funds check).
- Deposit money.
- Exit option to terminate the session.

## How It Works
1. The program starts by asking the user to enter a PIN.
2. If the entered PIN is correct, the user is presented with a menu.
3. Based on the user's selection, they can:
   - Check their balance.
   - Withdraw money (if the balance allows it).
   - Deposit money.
   - Exit the ATM session.
4. After performing an action, the menu is displayed again until the user chooses to exit.

## Code Structure
- **ATM Class**:
  - `checkpin()`: Verifies the user’s PIN.
  - `menu()`: Displays the available options.
  - `CheckBalance()`: Shows the current account balance.
  - `WithdrawMoney()`: Allows the user to withdraw funds if sufficient balance is available.
  - `depositMoney()`: Allows the user to deposit money into their account.

- **ATMMachine Class**:
  - Contains the `main()` method that initializes an `ATM` object and starts the PIN verification process.

## UML Diagram
```
        +----------------+
        |    ATMMachine  |
        |----------------|
        | +main()        |
        +----------------+
                |
                v
        +----------------+
        |      ATM       |
        |----------------|
        | - Balance: float|
        | - PIN: int      |
        |----------------|
        | +checkpin()     |
        | +menu()         |
        | +CheckBalance() |
        | +WithdrawMoney()|
        | +depositMoney() |
        +----------------+
```

## Flowchart
```plaintext
  +----------------+
  |  Start         |
  +----------------+
         |
         v
  +----------------+
  | Enter PIN      |
  +----------------+
         |
         v
  +----------------+
  | Verify PIN     |
  +----------------+
       | Yes / No
       v           v
  +----------------+   +----------------+
  | Show Menu      |   | Invalid PIN     |
  +----------------+   +----------------+
       |
       v
  +----------------+
  | User Choice    |
  +----------------+
       |  |  |  |
       |  |  |  |
       v  v  v  v
+------------+ +------------+ +------------+ +-------+
| Check Bal. | | Withdraw   | | Deposit    | | Exit  |
+------------+ +------------+ +------------+ +-------+
       |  |  |  |
       v  v  v  v
+------------+ +------------+ +------------+
| Show Menu  | | Update Bal | | Update Bal |
+------------+ +------------+ +------------+
       |
       v
+----------------+
|      End       |
+----------------+
```

## Usage Instructions
1. Run the Java program.
2. Enter the correct PIN (default: 12345) to access the ATM features.
3. Select an option from the menu:
   - Option `1`: Check your balance.
   - Option `2`: Withdraw money.
   - Option `3`: Deposit money.
   - Option `4`: Exit.
4. Follow on-screen instructions for further actions.
5. The program continues running until the user selects exit.

## Improvements
- Implement a user-friendly GUI.
- Store user data persistently using a database.
- Enhance security by hashing the PIN.
- Allow multiple users with different PINs and balances.

This project demonstrates basic Java concepts like class methods, conditional statements, loops, and user input handling. It's a great starting point for learning about banking applications in Java!

