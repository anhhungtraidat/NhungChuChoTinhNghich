package com.mycompany.app.week2;

// Factorial n!=n(n-1)(n-2)...x3x2x1
public class Recursion {
  int num;

  // Constructor
  Recursion() {
  } // default constructor- remember ; before }

  public Recursion(int number) {
    num = number;
  } // constructor for int

  public int RecursionF(int number) {
    this.num = number;
    if (this.num <= 1) // base case
      return 1;
    else
      return this.num * RecursionF(this.num - 1);
  }

}