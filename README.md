# hotel-backend

Backend do projektu aplikacji internetowej służącej do rezerwowania pobytu w hotelach oraz recenzowania tych hoteli

Użycie:

localhost:8080/tim/hotels/all [GET] -> Zwraca listę hoteli w JSON
localhost:8080/tim/hotels?id=X [GET] gdzie x to id hotelu -> Zwraca jeden wybrany hotel w JSON
localhost:8080/tim/hotels?id=X [DELETE] gdzie x to id hotelu -> Usuwa wybrany hotel
localhost:8080/tim/hotels [POST] gdzie body zawiera hotel w formacie JSON -> Dodaje nowy hotel

Przykładowy JSON poniżej
{
    "name": "NAZWA_HOTELU",
    "description": "OPIS_HOTELU",
    "michelinStars": 5,
    "address": "ADRES_HOTELU",
    "latitude": 50.25,
    "longitude": 25.50
},
