    public ArrayList<Match> buildMatches() {
        ArrayList<Match> game = new ArrayList<Match>();
        if (competitorList.size() % 2 == 0) {
            for (int i = 0; i < competitorList.size()/2; i++) {
                Match round1 = new Match(competitorList.get(i), competitorList.get(competitorList.size()-1-i));
                game.add(round1);
            }
        } else {
            for (int i = 1; i <= competitorList.size(); i++) {
                Match round1 = new Match(competitorList.get(i), competitorList.get(competitorList.size()-1-i));
                game.add(round1);
            }
        }
    }
    
    
