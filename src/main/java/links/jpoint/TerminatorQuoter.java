package links.jpoint;

@Transactonal
@DeprecatedClass(newImpl = T1000.class)
public class TerminatorQuoter implements Quoter {
    private String message;

    @InjectRandomInt(min = 4, max = 7)
    private int repeat;

    public void setMessage(String message) {
        this.message = message;
    }

    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("message = " + message);
        }
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }
}
