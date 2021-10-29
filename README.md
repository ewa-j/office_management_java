Java project for managing meeting rooms in the office.

### User stories

```
As a staff member
In order to distinguish between meeting rooms
I would like my meeting room to have a name

As an office manager
So that staff can coordinate meetings
I would like to add a meeting room to the office

As an office manager
So that I can manage meeting rooms
I would like to list all the meeting rooms in the office

As a staff member
In order to have meeting,
I would like to check if the meeting room is available or not (true or false)

As a staff member
In order to have a meeting,
I would like to be able to enter the meeting room and this should make it unavailable

As a staff member
In order to end a meeting
I would like to be able to leave the meeting room and this should make it available again

As a staff member
So that I can see where to have my meeting
I would like to be able to see a list of available rooms in the office

As a staff member
So that I can avoid interrupting a meeting
I would like an error if I try to use a room that has already been entered
```

### Headline specifications

- [x] Every room has a name.
- [x] Room can be added to the office.
- [x] Users can see a list of rooms in the office.
- [x] Availability of the room can be checked.
- [x] Entering the room makes it unavailable.
- [x] Leaving the room makes it available again.
- [x] Available rooms can be checked.
- [x] Entering the room that is not available at the moment raises an error.