// Loop through nested arrays

public class Explore {
 
  public static void main(String[] args) {
    String[] friends = {"Ben", "Alena", "Pasan"};

    // Extra Code personal challenge
    // 	- add sponsor for specific holes
    //    -added hole sponsor array for Golf Scramble honoring Dave
    String[] sponsor = {"Golf Sponsors: ", "Price Webber", "WLKY 32", "Golf Digest", "Golf Magazine",
  											"Dicks Sporting Goods", "Louisville Athletic Club (LAC)",
  											"U of L Golf Club", "Cherry Valley Golf Course", "Valley View Golf Club",
  											"Old Capital Golf Club", "Chariot Run", "Country Oaks Golf Club",
  											"French Lick Resort Dye Course", "French Lick Resort Donald Ross Course",
  											"Christmas Lake Golf Course"};
    
    int[][] scoreCards = {
      // Ben's
      {1, 2, 4, 2, 6, 5, 4, 3, 3, 2, 5, 7, 2, 7, 8, 4, 3, 2},
      // Alena's
      {2, 3, 5, 1, 1, 2, 3, 1, 1, 2, 4, 1, 3, 3, 2, 6, 3, 2},
      // Pasan's
      {4, 4, 2, 1, 2, 2, 1, 4, 2, 2, 2, 3, 2, 5, 8, 1, 2, 2}
    };
    
    // for each friend
    for (int i = 0; i < friends.length; i++) {
    //    print their name formatted with line spacing, 
      System.out.printf("%n %s %n-----------------%n",
                        friends[i]);
    // for each hole
      for (int j = 0; j < scoreCards[i].length; j++) {
    //    print their score
        System.out.printf("Hole #%d: %d %n",
                          j + 1,
                          scoreCards[i][j]);
      }
    	for (int k = 0; k < sponsor.length; k++) {
    		System.printf("%n %s", sponsor[k]);
    	}
    }
  }
}