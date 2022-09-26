package Cselab;


public class Lab_03 {
    public static void main(String[] args) {
        value x = new value();
        x.word01();
        x.word02();
        x.word03();
        x.word04();
        x.word05();
        x.word06();
        x.word07();
        x.word08();
        x.word09();
    }

    public static class value {
        private void word01() {
            for (int i = 1; i < 5; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }

        private void word02() {
            System.out.println();
            int p = 3;
            for (int i = 1; i < 5; i++) {
                for (int j = 0; j < p; j++) {
                    System.out.print(" ");
                }

                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
                p = p - 1;
            }
        }
            private void word03(){
                System.out.println();
                for (int i = 1; i<5; i++) {
                    for(int j = 5;j>i; j--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

            }

        private void word04(){
            System.out.println();
            int p=0;
            for (int i = 1; i<5; i++) {
                for (int j = 0; j<p; j++) {
                    System.out.print(" ");
                }

                for(int j = 5;j>i; j--) {
                    System.out.print("*");
                }
                System.out.println();
                p++;
            }

        }

        private void word05(){
            System.out.println();
            for (int i = 1; i<5; i++) {
                for(int j =0;j<i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
                for (int i = 1; i<5; i++) {
                    for(int j = 4;j>i; j--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }



        }
        private void word06(){
            System.out.println();
            int p=3;
            int q=1;
            for (int i = 1; i<5; i++) {
                for (int j = 0; j < p; j++) {
                    System.out.print(" ");
                }

                for(int j =0;j<i; j++) {
                    System.out.print("*");
                }
                System.out.println();
                p=p-1;
            }
            for (int i = 1; i<5; i++) {
                for (int j = 0; j < q; j++) {
                    System.out.print(" ");
                }

                for(int j = 4;j>i; j--) {
                    System.out.print("*");
                }
                System.out.println();
                q=q+1;
            }



        }

        private void word07() {
            System.out.println();
            int p = 3;
            int q = 1;
            //int c=0;
            for (int i = 4; i >0 ; i--) {
                for (int j = 0; j < p; j++) {
                    System.out.print(" ");
                }


                for (int j =0; j<q; j++) {
                    System.out.print("*");

                }
                System.out.println();
                p = p - 1;
                q=q+2;
            }
        }
        private void word08() {
            System.out.println();
            int p = 0;
            int q = 7;
            //int c=0;
            for (int i = 4; i >0 ; i--) {
                for (int j = 0; j < p; j++) {
                    System.out.print(" ");
                }


                for (int j =0; j<q; j++) {
                    System.out.print("*");

                }
                System.out.println();
                p = p+1;
                q=q-2;
            }
        }

        private void word09() {
            System.out.println();
            int p = 3;
            int q = 1;
            //int c=0;
            for (int i = 4; i >0 ; i--) {
                for (int j = 0; j < p; j++) {
                    System.out.print(" ");
                }


                for (int j =0; j<q; j++) {
                    System.out.print("*");

                }
                System.out.println();
                p = p - 1;
                q=q+2;
            }
            int m = 0;
            int n = 5;
            //int c=0;
            for (int i = 4; i >0 ; i--) {
                for (int j = 0; j <= m; j++) {
                    System.out.print(" ");
                }


                for (int j =0; j<n; j++) {
                    System.out.print("*");

                }
                System.out.println();
                m = m+1;
                n=n-2;
            }
        }
        }
    }

