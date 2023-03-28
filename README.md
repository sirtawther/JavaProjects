# Mortgage Calculator

This is a simple Java program that calculates monthly mortgage payments based on the loan amount, annual interest rate, and loan term (in years).

## Usage

To use the program, simply run the Main.java file in your Java IDE or compile and run it from the command line.

The program will prompt the user to enter the loan amount, annual interest rate, and loan term, and will then calculate the monthly mortgage payment using the following formula:

```
M = P * r * (Math.pow(1+r,n)) / (Math.pow(1+r,n) - 1)

```

Where:

   * M is the monthly mortgage payment
   * P is the principle (loan amount)
   * r is the monthly interest rate (annual interest rate divided by 12)
   * n is the number of monthly payments (per period in years)

The calculated monthly mortgage payment will be displayed on the console.

### Example
```
Principle: 100000
Annual Interest Rate: 4.5
Period (Years): 30
Mortgage: 506.69
```

### Contributing

Contributions to this project are welcome. If you find any bugs or would like to suggest an improvement, please feel free to create an issue or submit a pull request.

### License
This project is licensed under the MIT License - see the LICENSE file for details.
