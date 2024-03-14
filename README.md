# Class Tačka

Nulti zahtev: klasa Tačka je podklasa klase Shape (nasleđuje klasu Shape)

Zahtevi:

- klasa Tačka treba da sadrži atribute za predstavljanje tačke u koordinatnom sistemu u dve dimenzije u celobrojnim vrednostima
- klasa Tačka treba da sadrži atribut koji sadrži da li je tačka selektovana ili ne (boolean)
- klasa Tačka treba da sadrži konstruktor bez argumenata (difoltni)
- klasa Tačka treba da sadrži konstruktor kojim možemo da inicijalizujemo koordinate tačke
- klasa Tačka treba da sadrži konstruktor kojim se inicijalizuju svi atributi klase
- klasa Tačka treba da sadrži metodu kojom se računa udaljenost tačke od neke druge tačke
- klasa Tačka treba da sadrži metodu kojom se određuje da li tačka sadrži neku drugu tačku (uslov da je distanca između tačaka <= 2)
- klasa Tačka treba da sadrži metodu toString koja vraća koordinate tačke u zagradi razdvojene zarezom
- klasa Tačka treba da sadrži metodu equals koja prima univerzalni tip object i vraća boolean u zavisnosti da li je poslati objekat jednak sa datim
- klasa Tačka treba da sadrži gettere i settere za koordinate (x, y)
- klasa Tačka treba da overajduje metodu Draw i da u toj metodi postavi boju na crnu 
- klasa Tačka treba da nacrta liniju pomoću metode DrawLine sa argumentima 
	1) x - 2, 
	2) y, 
	3) x + 2, 
	4) y
- klasa Tačka treba da nacrta vertikalnu liniju pomoću metode DrawLine sa sledećim argumentima:
	1) x,
	2) y - 2,
	3) x,
	4) y + 2
- ako je tačka selektovana, treba da promeni boju u plavu i da se oko nje nacrta pravougaonik koristeći metodu DrawRect
	1) x - 2,
	2) y - 2,
	3) 4,
	4) 4
- klasa Tačka treba da sadrži metodu za pomeranje tako što će tačka da se pomeri na nove date koordinate (MoveTo)
- klasa Tačka treba da overajduje metodu MoveTo
- klasa Tačka treba da overajduje metodu MoveBy
- klasa Tačka treba da overajduje metodu CompareTo