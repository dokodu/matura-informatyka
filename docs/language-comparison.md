# Porównanie języków programowania

Dla porównania składni języków poniżej zostało zamieszczone rozwiązanie tego samego prostego zadania z [CodinGame](https://www.codingame.com/ide/puzzle/onboarding) w różnych językach.

Ten sam algorytm napisany w następujących językach:

## Pascal

```Pascal
program Answer;
{$H+}
uses sysutils, classes, math;

// Helper to read a line and split tokens
procedure ParseIn(Inputs: TStrings) ;
var Line : string;
begin
    readln(Line);
    Inputs.Clear;
    Inputs.Delimiter := ' ';
    Inputs.DelimitedText := Line;
end;

var
    enemy1 : String; // name of enemy 1
    dist1 : Int32; // distance to enemy 1
    enemy2 : String; // name of enemy 2
    dist2 : Int32; // distance to enemy 2
    Inputs: TStringList;
begin
    Inputs := TStringList.Create;
    // game loop
    while true do
    begin
        ParseIn(Inputs);
        enemy1 := Inputs[0];
        ParseIn(Inputs);
        dist1 := StrToInt(Inputs[0]);
        ParseIn(Inputs);
        enemy2 := Inputs[0];
        ParseIn(Inputs);
        dist2 := StrToInt(Inputs[0]);
        if (dist1<dist2) then
        begin
          writeln(enemy1);
        end
        else 
        begin
          writeln(enemy2);
        end;
        flush(StdErr); flush(output);
    end;
end.
```

## C++

```C++
#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    // game loop
    while (1) {
        string enemy1; // name of enemy 1
        cin >> enemy1; cin.ignore();
        int dist1; // distance to enemy 1
        cin >> dist1; cin.ignore();
        string enemy2; // name of enemy 2
        cin >> enemy2; cin.ignore();
        int dist2; // distance to enemy 2
        cin >> dist2; cin.ignore();
        cout << (dist1<dist2?enemy1:enemy2) << endl;
    }
}
```

## Java

```Java
import java.util.*;
import java.io.*;
import java.math.*;

class Player {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        // game loop
        while (true) {
            String enemy1 = in.next(); // name of enemy 1
            int dist1 = in.nextInt(); // distance to enemy 1
            String enemy2 = in.next(); // name of enemy 2
            int dist2 = in.nextInt(); // distance to enemy 2
            System.out.println(dist1<dist2?enemy1:enemy2);
        }
    }
}
```

## JavaScript

```JavaScript
// game loop
while (true) {
    var enemy1 = readline(); // name of enemy 1
    var dist1 = parseInt(readline()); // distance to enemy 1
    var enemy2 = readline(); // name of enemy 2
    var dist2 = parseInt(readline()); // distance to enemy 2
    print(dist1<dist2?enemy1:enemy2);
}
```

## Python

```Python
import sys
import math

# game loop
while True:
    enemy_1 = input()  # name of enemy 1
    dist_1 = int(input())  # distance to enemy 1
    enemy_2 = input()  # name of enemy 2
    dist_2 = int(input())  # distance to enemy 2
    print(enemy_1 if dist_1<dist_2 else enemy_2)
```

## ... A teraz coś z zupełnie innej beczki: Clojure

```Clojure
(ns Player
  (:gen-class))

(defn -main [& args]
  (while true
    (let [enemy1 (read) dist1 (read) enemy2 (read) dist2 (read)]
      (println (if (< dist1 dist2) enemy1 enemy2)))))
```
