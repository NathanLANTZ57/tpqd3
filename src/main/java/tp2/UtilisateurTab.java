package tp2;

import java.util.ArrayList;
import java.util.Collections;

public class UtilisateurTab {
    private String email;
    private ArrayList<Integer> tab;

    public UtilisateurTab(String email) {
        if (isValidEmail(email)) {
            this.email = email;
            this.tab = new ArrayList<>();
        } else {
            throw new IllegalArgumentException("Invalid email format");
        }
    }

    public boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email != null && email.matches(emailRegex);
    }

    public void addNumber(int number) {
        this.tab.add(number);
    }

    public ArrayList<Integer> getTab() {
        return tab;
    }

    public int getSum() {
        int sum = 0;
        for (int number : tab) {
            sum += number;
        }
        return sum;
    }

    public void sortTab() {
        Collections.sort(tab);
    }

    public double getMedian() {
        if (tab.isEmpty()) {
            throw new IllegalStateException("The tab is empty.");
        }

        int size = tab.size();
        if (size % 2 == 0) {
            return (tab.get(size / 2 - 1) + tab.get(size / 2)) / 2.0;
        } else {
            return tab.get(size / 2);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UtilisateurTab{");
        sb.append("email='").append(email).append('\'');
        sb.append(", tab=").append(tab);
        sb.append('}');
        return sb.toString();
    }
}
