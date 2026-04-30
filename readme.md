# Use Case : Taxi Management Service

## Core Features :

1. Driver & Rider Registration — CRUD APIs for registering drivers (with vehicle details) and riders. Drivers have a status: AVAILABLE, ON_TRIP, OFFLINE.


2. Book & Complete a Ride — Rider requests a ride with source + destination. System finds the nearest available driver, creates a trip, and marks driver as ON_TRIP. A "complete ride" endpoint ends the trip and marks driver AVAILABLE again.


3. Fare Calculation — On trip completion, calculate fare based on distance (use simple Euclidean/Manhattan distance from coordinates). Apply a base fare + per-km rate.


## Bonus Feature :

1. Ride History & Earnings Report — Endpoint to fetch all past trips for a rider or driver, with total earnings summary for the driver (total trips + total amount earned).



## High level capacity estimatioon

Daily requests - 10million 
Requests per second - 10,000,000 / (24 * 3600) = 115 rides per second

QPS (WRITE) = 115

QPS (READ) = 1,150



## Bandwith Estimation 

Assuming each write is 20kb

Incoming Traffic = 20kb * 115 = 2.3MBPS 

Outgoing Traffic = 23MBPS



## Storage Estimation

Let's assume we store data for 10 years. 

## Caching Estimation



# Entities :

User (Abstract Class) - Long id, String name

Driver extends User - Vehicle vehicle, DriverStatus driverStatus, Long totalEarning, List<Ride> RideHistory

Vehicle -  VehicleType vehicleType, String vehicleNumber

Rider extends User 

Ride - Long id, Rider rider, Driver driver, RideStatus rideStatus, Location startLocation, Location endLocation, Long fare

Location - int x, int y, String Name




## ENUMS : 

VehicleType - SEDAN, SUV, HATCHBACK

DriverStatus - AVAILABLE, ON_TRIP, OFFLINE

RideStatus - ACTIVE, COMPLETED