package java11to17.example4;

// sealed keyword allows you to specify which classes are permitted to extend a base class. This gives more control over class hierarchies.
public sealed class Vehicle permits Car, Truck {}
