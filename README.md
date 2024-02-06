# Room Scheduler Management System for College

## Overview

The Room Scheduler Management System is an application developed for Tiny College, designed to efficiently manage room reservations within the college's premises. The system allows faculty members to reserve rooms based on specific dates and seating capacity requirements, without the need to select a specific room. The application features a user-friendly GUI and is powered by a <b>Derby database</b>, utilizing the concepts of <b>Object-Oriented Design and Programming</b>, both in the application and database layers.

## Key Features

- Faculty Management: Add faculty members to the system with unique identifiers.
- Room Reservations: Automatically assigns rooms based on the number of seats required and availability, placing unfulfilled requests on a waitlist.
- Reservation Status: View reservations by date, displaying all faculty members who have successfully reserved rooms.
- Waitlist Status: Review the waitlist in date order, showing faculty members waiting for room availability.

## Classes and Design

#### Core Classes

- Faculty: Manages faculty information, including adding new faculty members and retrieving a list of faculty names from the database.
- Room: Handles room attributes and availability, allowing for the addition and removal of rooms as well as querying room details based on seat requirements.
- Date: Represents specific dates for room reservations, facilitating the addition of new dates and retrieval of all available dates.
- Reservations: Coordinates the reservations data, including adding new reservations, checking reservation status by date, and managing room assignments.

#### Utility and Data Access Classes

- ReservationEntry: Encapsulates details about a reservation, including faculty name, room assigned, date, seats required, and timestamp of the reservation.
- ReservationQueries: Contains methods for interacting with the reservations table in the database, such as adding reservations, retrieving reservations by date or faculty, and managing the waiting list.
- RoomEntry: Represents a room entry with attributes for room name and seat capacity.
- RoomQueries: Provides access to room-related data in the database, including fetching possible rooms based on seat requirements and adding or dropping rooms.
- WaitlistEntry: Models an entry in the waiting list, holding information about the faculty member, desired date, number of seats, and timestamp.
- WaitlistQueries: Manages the waiting list, including adding entries to the waitlist, retrieving the waitlist by date, and deleting waitlist entries.

#### Main GUI Class

- RoomSchedulerFrame: The main graphical user interface of the application. It orchestrates user interactions, allowing faculty members to add themselves, reserve rooms based on specific dates and seat requirements, and view reservation statuses and waitlist information

  
The application provides a comprehensive solution for room scheduling within Tiny College, ensuring efficient use of resources through an intuitive interface and robust backend logic. Its design follows best practices in object-oriented programming and database design, ensuring maintainability and scalability.

## Database Design

The system uses a Derby database with a schema designed to prevent data redundancy. It includes tables for managing rooms, dates, faculty, reservations, and waitlists, ensuring efficient data manipulation and retrieval.

## Tools and Concepts

- Tools: Java, NetBeans IDE, Derby Database
- Programming Concepts: Object-Oriented Programming (OOP), Database Management, GUI Design, Event-Driven Programming

