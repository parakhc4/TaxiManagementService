# Use Case : Taxi Management Service

## Core Features :

1. Driver & Rider Registration — CRUD APIs for registering drivers (with vehicle details) and riders. Drivers have a status: AVAILABLE, ON_TRIP, OFFLINE.


2. Book & Complete a Ride — Rider requests a ride with source + destination. System finds the nearest available driver, creates a trip, and marks driver as ON_TRIP. A "complete ride" endpoint ends the trip and marks driver AVAILABLE again.


3. Fare Calculation — On trip completion, calculate fare based on distance (use simple Euclidean/Manhattan distance from coordinates). Apply a base fare + per-km rate.


## Bonus Feature

1. Ride History & Earnings Report — Endpoint to fetch all past trips for a rider or driver, with total earnings summary for the driver (total trips + total amount earned).