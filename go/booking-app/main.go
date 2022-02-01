package main

import (
    "fmt"
    "strings"
)

func main(){
    conferenceName := "Go Conference"
    const conferenceTickets = 50
    var remainingTickets uint = conferenceTickets
    bookings := []string{}

    fmt.Printf("Conference is: %T, tikets is %T, remaining is: %T \n\n", conferenceName, conferenceTickets, remainingTickets)
    fmt.Printf("Welcome to %v booking application\n", conferenceName)
    fmt.Printf("We have total %v tickets and %v are still available \n", conferenceTickets ,remainingTickets)
    fmt.Println("Get your tickets here to atten tickets here to attend")

    for {
        var firstName string
        var lastName string
        var email string
        var userTickets uint

        fmt.Print("\nWhat your first name: ")
        fmt.Scan(&firstName)
        fmt.Print("What your last name: ")
        fmt.Scan(&lastName)
        fmt.Print("What your email: ")
        fmt.Scan(&email)
        fmt.Print("Enter tickets number: ")
        fmt.Scan(&userTickets)

        bookings = append(bookings, firstName + " " + lastName)
        remainingTickets = remainingTickets - userTickets
        fmt.Printf("\nThanks %v %v for booking %v tickets, You will confirmation email at %v.\n", firstName, lastName, userTickets, email)
        fmt.Printf("%v Tickets for %v\n", remainingTickets, conferenceName)

        firstNames := []string{}
        for _, booking := range bookings { //_ using when index is not necesary
            var names = strings.Fields(booking)
            firstNames = append(firstNames, names[0])
        }
        fmt.Printf("These are all our bookings: %v\n", bookings)
        fmt.Printf("The first names with bookings are %v\n", firstNames)
    }
    //Array
    //bookings = [50]string { "Maria", "José", "Marcos" }  || bookings [50]string
    //bookings[0] = "Juan"
    // fmt.Printf("first element to array", boookings[0])
    // len(boookings) -> size

    //Slices
    //bookings = []string
    //bookings.append("Luis)
    //bookings.append("Juan")
    // fmt.Printf("first element to array", boookings[0])
    // len(boookings) -> size
}
