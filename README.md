# Class Tacka

Nulti zahtev: klasa Tacka je podklasa klase Shape (nasledjuje klasu Shape)

Zahtevi:

 *[_] klasa Tacka treba da sadrzi atribute za predstavljanje tacke u koordinatnom sistemu u dve dimenzije u celobrojnim vrednostima
 *[_] klasa Tacka treba da sadrzi atribut koji sadrzi da li je tacka selektovana ili ne (boolean)
 *[_] klasa Tacka treba da sadrzi konstruktor bez argumenata (difoltni)
 *[_] klasa Tacka treba da sadrzi konstruktor kojim mozemo da inicijalizujemo koordinate tacke
 *[_] klasa Tacka treba da sadrzi konstruktor kojim se inicijalizuju svi atributi klase
 *[_] klasa Tacka treba da sadrzi metodu kojom se racuna udaljenost tacke od neke druge tacke
 *[_] klasa Tacka treba da sadrzi metodu kojom se odredjuje da li tacka sadrzi neku drugu tacku (uslov da je distanca izmedju tacaka <= 2)
 *[_] klasa Tacka treba da sadrzi metodu toString koja vraca koordinate tacke u zagradi razdvojene zarezom
 *[_] klasa Tacka treba da sadrzi metodu equals koja prima univerzalni tip object i vraca boolean u zavisnosti da li je poslati objekat jednak sa datim
 *[_] klasa Tacka treba da sadrzi gettere i settere za koordinate (x, y)
 *[_] klasa Tacka treba da overajduje metodu Draw i da u toj metodi postavi boju na crnu 
 *[_] klasa Tacka treba da nacrta liniju pomocu metode DrawLine sa argumentima 
	  1) x - 2, 
	  2) y, 
	  3) x + 2, 
	  4) y
 *[_] klasa Tacka treba da nacrta vertikalnu liniju pomocu metode DrawLine sa sledecim argumentima:
	  1) x,
	  2) y - 2,
	  3) x,
	  4) y + 2
 *[_] ako je tacka selektovana, treba da promeni boju u plavu i da se oko nje nacrta pravougaonik koristeci metodu DrawRect
	  1) x - 2,
	  2) y - 2,
	  3) 4,
	  4) 4
 *[_] klasa Tacka treba da sadrzi metodu za pomeranje tako sto ce tacka da se pomeri na nove date koordinate (MoveTo)
 *[_] klasa Tacka treba da overajduje metodu MoveTo
 *[_] klasa Tacka treba da overajduje metodu MoveBy
 *[_] klasa Tacka treba da overajduje metodu CompareTo