public class User {

    int _id;
    String firstName,lastName,middleName;
    boolean firstWork, secondWork, thirdWork;

    public User(int _id, String firstName, String lastName,String middleName,
                boolean firstWork, boolean secondWork, boolean thirdWork) {
        this._id = _id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.firstWork = firstWork;
        this.secondWork = secondWork;
        this.thirdWork = thirdWork;
    }

}
