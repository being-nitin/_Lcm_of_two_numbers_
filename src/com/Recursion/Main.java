package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// Lcm of two numbers.
        int ans = gcd_lcm(2,9);
        System.out.println(ans);
    }
    static int gcd(int a, int b){
        if(a==0) {
            return b;
        }
        return gcd(b%a,a);
    }
    static int gcd_lcm(int a,int b){
        return (a*b)/gcd(b%a,a);
    }
}
