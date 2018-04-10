class A {
    void m() {
        System.out.println("outer");
    }

    String n() {
        return "outer";
    }
}

public class BreakPointTest {
    public static void main(String[] args) {
        new BreakPointTest().go();
        int j = 0;
        new A() {
            void m() {
                System.out.println("anonymous");
            }
        }.m();

        for (int i = 1; i <= 100; i++) {
            if (i <= 99) {
                j++;
            } else {
                System.out.println(j);
            }    
        }
    }

    void go() {
        new A().m();
        class A {
            String n() {
                return "inner";
            }

            void m() {
                System.out.println("inner");
            }
        }
        new A().m();
    }

    static class A {
        String n() {
            return "middle";
        }

        void m() {
            System.out.println("middle");
        }
    }
}