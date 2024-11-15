package Pack1;

class Person {
    private String _fName;
    private String _lName;

    Person() {
    }

    Person(String fName, String lName) {
        _fName = fName;
        _lName = lName;
    }

    public String get_fName() {
        return _fName;
    }

    public void set_fName(String _fName) {
        this._fName = _fName;
    }

    public String get_lName() {
        return _lName;
    }

    public void set_lName(String _lName) {
        this._lName = _lName;
    }

}