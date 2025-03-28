package creational.builder.pc;

public class TestBuilder {
    public static void main(String[] args) {
        //Using builder to get the object in a single line of code and
        //without any inconsistent behavioural.state or arguments management issues
        Computer.Builder builder = new Computer.Builder("500 GB", "2 GB")
        // some statements in between

        // the advantage of the builder pattern is that there is no inconsistent behavioural.state of the
        // computer object as it hasn't been "built" yet.
            .setBluetoothEnabled(true)

        // more statements in between
            .setGraphicsCardEnabled(true);

        Computer computer = builder.build();
        System.out.println(computer);
    }
}
