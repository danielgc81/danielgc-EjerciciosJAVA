package Unidad4.CreacionClases;

class A {
   private int n;
   A () {
      this(0);
   }
   A(int n) {
      this.n = n;
   }
}

class B extends A {
   private String s;
   B(int n, String s) {
      super(n);
      this.s = s;
   }
}

class C extends A {
   C () {
      
   }
}
