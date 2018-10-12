class BreakContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.println("nope!");
                continue;
            } else if (i + 16 == 40) {
                break;
            } else {
                System.out.println(i);
            }
        }

    }
}