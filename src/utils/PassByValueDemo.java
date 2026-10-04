class Box{
    int value;
}

public class PassByValueDemo
{
    static void mutatePrimitive(int x){     // x is a primitive local variable stored in the Stack
        x = 50;                             // x is updated in the stack; caller's variable is unchanged
    }

    static void mutateByReference(Box b){   // b is a reference variable stored in the stack; it contains a copied reference
        b.value = 100;                      // value is stored in the Box Object on the Heap; the caller can see the changes
    }

    static void assigningNewReference(Box b){   // b is a reference variable stored in the stack; it contains a copied reference
        b = new Box();                          // b is updated in the stack to reference to the new Object stored in the heap
        b.value = 50;                           // value is stored in the new Object on the Heap
    }

    public static void main(String[] args){
        int x = 50;                         // x is the primitive local variable stored in the stack
        mutatePrimitive(x);
        System.out.println(x);              // 50 - Untouched

        Box b = new Box();                  // b is the reference variable stored in the stack; the Box object is stored in the heap
        b.value = 10;                       // value is stored in the Box object in the heap
        System.out.println(b);
        mutateByReference(b);
        System.out.println(b);              // 100 - Mutated Through the Reference
        assigningNewReference(b);
        System.out.println(b);              // 100 - UnTouched by assigningNewReference as we are updating the new Object
    }
}