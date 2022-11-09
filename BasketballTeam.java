import java.util.List;

public class BasketballTeam {
    @Override
    public String toString() {
        return "BasketballTeam{" +
                "teamName='" + teamName + '\'' +
                ", initials='" + initials + '\'' +
                ", players=" + players +
                ", staffMembers=" + staffMembers +
                '}';
    }

    public String teamName;
    public String initials;
    public List<Player> players;
    public List<Staff> staffMembers;
}
