package javaPrac;

public class Account implements OnlineAccount, Comparable<Account> {
    String ownerName;
    int noOfRegularMovies;

    public String getOwnerName() {
        return ownerName;
    }

    public int getNoOfRegularMovies() {
        return noOfRegularMovies;
    }

    public int getNoOfexclusiveMovies() {
        return noOfexclusiveMovies;
    }

    int noOfexclusiveMovies;

    public Account(String ownerName, int noOfRegularMovies, int noOfexclusiveMovies) {
        this.ownerName = ownerName;
        this.noOfRegularMovies = noOfRegularMovies;
        this.noOfexclusiveMovies = noOfexclusiveMovies;

    }

    @Override
    public int basePrice() {
        return 0;
    }

    @Override
    public int regularMoviePrice() {
        return 0;
    }

    @Override
    public int exclusiveMoviePrice() {
        return 0;
    }

    double monthlyCost() {
        double MonthlyCost = 0;

        MonthlyCost = this.basePrice() + ((this.getNoOfRegularMovies() * this.regularMoviePrice())
                + (this.getNoOfexclusiveMovies() * this.exclusiveMoviePrice()));

        return MonthlyCost;
    }

    @Override
    public int compareTo(Account o) {
        if(this.monthlyCost() > o.monthlyCost()) {
            return 1;
        } else if(this.monthlyCost() > o.monthlyCost()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "ownerName='" + ownerName + '\'' +
                ", noOfRegularMovies=" + noOfRegularMovies +
                ", noOfexclusiveMovies=" + noOfexclusiveMovies +
                '}';
    }
}
