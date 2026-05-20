package labFinalEx;

public class StudioTest {

	public static void main(String[] args) {
		try {
			Film f = new ActionFilm("The Bourne Identity", "Doug Liman", 119, 1800, 3, 50, "PG-13");
		} catch (StudioException e) {
			System.out.println(e.getMessage());
		}
		try {
			Studio catchs = new Studio("Sony", 0);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("---------------------------------------------");
		try {
			Actor a1 = new Actor("Matt Damon", "A001");
			Actor a2 = new Actor("Leonardo DiCaprio", "A002");
			Actor a3 = new Actor("Jim Carry", "A003");
			Studio s1 = new Studio("Hollywood", 6);
			Film f1 = new ActionFilm("The Bourne Identity", "Doug Liman", 119, 2002, 3, 50, "PG-13");
			f1.addActor(a1);
			Film f2 = new ActionFilm("Inception", "Christopher Nolan", 148, 2010, 3, 100, "PG-13");
			f2.addActor(a2);
			f2.addActor(a1);
			Film f3 = new ComedyFilm("Anchorman", "Adam McKay", 94, 2004, 3, 200, false);
			f3.addActor(a3);
			s1.add(f1);
			s1.add(f2);
			s1.add(f3);
			System.out.println(s1.add(f1));
			Film f4 = new ComedyFilm("Liar Liar", "Tom Shadyac", 86, 1997, 3, 150, false);
			f4.addActor(a3);
			s1.addLast(f4);
			Film f5 = new ActionFilm("Fast & Furious", "Justin Lin", 107, 2009, 3, 80, "PG-13");
			f5.addActor(a1);
			s1.addFirst(f5);
			Film f6 = new ComedyFilm("Robin Special", "Live", 60, 2001, 3, 100, true);
			s1.addAt(f6, 2);
			System.out.println(s1);
			System.out.println(f1.listActors());
			System.out.println(f2.listActors());
			System.out.println("---------------------------------------------");
			System.out.println("removeFirst -> " + s1.removeFirst());
			System.out.println("removeLast -> " + s1.removeLast());
			System.out.println("removeAt(1) -> " + s1.removeAt(1));
			System.out.println("remove " + s1.remove(f1));
			System.out.println("---------------------------------------------");
			System.out.println(s1);
			s1.playAll();
			System.out.println("Longest Film: "+s1.getLongest());
			ActionFilm[] arr = s1.getActionFilms();
			System.out.println("ActionFilms (" + arr.length + "):");

			for (ActionFilm f : arr) {
				System.out.println(f);
			}
		} catch (StudioException e) {
			System.out.println(e.getMessage());
		}
	}

}
