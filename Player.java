

public class Player {

    private String nickname;
    private int score;

    public Player(String nickname, int score) {
        this.nickname = nickname;
        this.score = score;
    }

    public String getName() {
        return nickname;
    }

    public int getScore() {
        return score;
    }

    public String toString() {
        return nickname + " : " + score;
    }
}
