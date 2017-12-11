package com.jware.gatoapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameNActivity extends Activity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    char man, com;
    Com computer = new Com();
    Tab principal = new Tab();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_n);

        man = getIntent().getCharExtra("manPlay", 'O');
        com = getIntent().getCharExtra("comPlay", 'X');
        principal.initialize();

        btn1 = (Button) findViewById(R.id.btnn1);
        btn2 = (Button) findViewById(R.id.btnn2);
        btn3 = (Button) findViewById(R.id.btnn3);
        btn4 = (Button) findViewById(R.id.btnn4);
        btn5 = (Button) findViewById(R.id.btnn5);
        btn6 = (Button) findViewById(R.id.btnn6);
        btn7 = (Button) findViewById(R.id.btnn7);
        btn8 = (Button) findViewById(R.id.btnn8);
        btn9 = (Button) findViewById(R.id.btnn9);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnn1) {
            //btn1.setText(man + "");
            btn1.setEnabled(false);
            principal.putIntoTab(0, 0, man);
            if(principal.findIfWon() == man) {
                Intent winner = new Intent(GameNActivity.this, EndActivity.class);
                winner.putExtra("Winner", man);
                winner.putExtra("manPlay", man);
                winner.putExtra("comPlay", com);
                winner.putExtra("diff", 'N');
                startActivity(winner);
            }else if(principal.findIfWon() == 'D') {
                Intent winner = new Intent(GameNActivity.this, EndActivity.class);
                winner.putExtra("Winner", 'D');
                winner.putExtra("manPlay", man);
                winner.putExtra("comPlay", com);
                winner.putExtra("diff", 'N');
                startActivity(winner);
            }
            computerTurn();
        }else if(v.getId() == R.id.btnn2) {
            //btn2.setText(man + "");
            btn2.setEnabled(false);
            principal.putIntoTab(0, 1, man);
            if(principal.findIfWon() == man) {
                Intent winner = new Intent(GameNActivity.this, EndActivity.class);
                winner.putExtra("Winner", man);
                winner.putExtra("manPlay", man);
                winner.putExtra("comPlay", com);
                winner.putExtra("diff", 'N');
                startActivity(winner);
            }else if(principal.findIfWon() == 'D') {
                Intent winner = new Intent(GameNActivity.this, EndActivity.class);
                winner.putExtra("Winner", 'D');
                winner.putExtra("manPlay", man);
                winner.putExtra("comPlay", com);
                winner.putExtra("diff", 'N');
                startActivity(winner);
            }
            computerTurn();
        }else if(v.getId() == R.id.btnn3) {
            //btn3.setText(man + "");
            btn3.setEnabled(false);
            principal.putIntoTab(0, 2, man);
            if(principal.findIfWon() == man) {
                Intent winner = new Intent(GameNActivity.this, EndActivity.class);
                winner.putExtra("Winner", man);
                winner.putExtra("manPlay", man);
                winner.putExtra("comPlay", com);
                winner.putExtra("diff", 'N');
                startActivity(winner);
            }else if(principal.findIfWon() == 'D') {
                Intent winner = new Intent(GameNActivity.this, EndActivity.class);
                winner.putExtra("Winner", 'D');
                winner.putExtra("manPlay", man);
                winner.putExtra("comPlay", com);
                winner.putExtra("diff", 'N');
                startActivity(winner);
            }
            computerTurn();
        }else if(v.getId() == R.id.btnn4) {
            //btn4.setText(man + "");
            btn4.setEnabled(false);
            principal.putIntoTab(1, 0, man);
            if(principal.findIfWon() == man) {
                Intent winner = new Intent(GameNActivity.this, EndActivity.class);
                winner.putExtra("Winner", man);
                winner.putExtra("manPlay", man);
                winner.putExtra("comPlay", com);
                winner.putExtra("diff", 'N');
                startActivity(winner);
            }else if(principal.findIfWon() == 'D') {
                Intent winner = new Intent(GameNActivity.this, EndActivity.class);
                winner.putExtra("Winner", 'D');
                winner.putExtra("manPlay", man);
                winner.putExtra("comPlay", com);
                winner.putExtra("diff", 'N');
                startActivity(winner);
            }
            computerTurn();
        }else if(v.getId() == R.id.btnn5) {
            //btn5.setText(man + "");
            btn5.setEnabled(false);
            principal.putIntoTab(1, 1, man);
            if(principal.findIfWon() == man) {
                Intent winner = new Intent(GameNActivity.this, EndActivity.class);
                winner.putExtra("Winner", man);
                winner.putExtra("manPlay", man);
                winner.putExtra("comPlay", com);
                winner.putExtra("diff", 'N');
                startActivity(winner);
            }else if(principal.findIfWon() == 'D') {
                Intent winner = new Intent(GameNActivity.this, EndActivity.class);
                winner.putExtra("Winner", 'D');
                winner.putExtra("manPlay", man);
                winner.putExtra("comPlay", com);
                winner.putExtra("diff", 'N');
                startActivity(winner);
            }
            computerTurn();
        }else if(v.getId() == R.id.btnn6) {
            //btn6.setText(man + "");
            btn6.setEnabled(false);
            principal.putIntoTab(1, 2, man);
            if(principal.findIfWon() == man) {
                Intent winner = new Intent(GameNActivity.this, EndActivity.class);
                winner.putExtra("Winner", man);
                winner.putExtra("manPlay", man);
                winner.putExtra("comPlay", com);
                winner.putExtra("diff", 'N');
                startActivity(winner);
            }else if(principal.findIfWon() == 'D') {
                Intent winner = new Intent(GameNActivity.this, EndActivity.class);
                winner.putExtra("Winner", 'D');
                winner.putExtra("manPlay", man);
                winner.putExtra("comPlay", com);
                winner.putExtra("diff", 'N');
                startActivity(winner);
            }
            computerTurn();
        }else if(v.getId() == R.id.btnn7) {
            //btn7.setText(man + "");
            btn7.setEnabled(false);
            principal.putIntoTab(2, 0, man);
            if(principal.findIfWon() == man) {
                Intent winner = new Intent(GameNActivity.this, EndActivity.class);
                winner.putExtra("Winner", man);
                winner.putExtra("manPlay", man);
                winner.putExtra("comPlay", com);
                winner.putExtra("diff", 'N');
                startActivity(winner);
            }else if(principal.findIfWon() == 'D') {
                Intent winner = new Intent(GameNActivity.this, EndActivity.class);
                winner.putExtra("Winner", 'D');
                winner.putExtra("manPlay", man);
                winner.putExtra("comPlay", com);
                winner.putExtra("diff", 'N');
                startActivity(winner);
            }
            computerTurn();
        }else if(v.getId() == R.id.btnn8) {
            //btn8.setText(man + "");
            btn8.setEnabled(false);
            principal.putIntoTab(2, 1, man);
            if(principal.findIfWon() == man) {
                Intent winner = new Intent(GameNActivity.this, EndActivity.class);
                winner.putExtra("Winner", man);
                winner.putExtra("manPlay", man);
                winner.putExtra("comPlay", com);
                winner.putExtra("diff", 'N');
                startActivity(winner);
            }else if(principal.findIfWon() == 'D') {
                Intent winner = new Intent(GameNActivity.this, EndActivity.class);
                winner.putExtra("Winner", 'D');
                winner.putExtra("manPlay", man);
                winner.putExtra("comPlay", com);
                winner.putExtra("diff", 'N');
                startActivity(winner);
            }
            computerTurn();
        }
        else {
            //btn9.setText(man + "");
            btn9.setEnabled(false);
            principal.putIntoTab(2, 2, man);
            if(principal.findIfWon() == man) {
                Intent winner = new Intent(GameNActivity.this, EndActivity.class);
                winner.putExtra("Winner", man);
                winner.putExtra("manPlay", man);
                winner.putExtra("comPlay", com);
                winner.putExtra("diff", 'N');
                startActivity(winner);
            }else if(principal.findIfWon() == 'D') {
                Intent winner = new Intent(GameNActivity.this, EndActivity.class);
                winner.putExtra("Winner", 'D');
                winner.putExtra("manPlay", man);
                winner.putExtra("comPlay", com);
                winner.putExtra("diff", 'N');
                startActivity(winner);
            }
            computerTurn();
        }
    }

    public void computerTurn() {
        Tab tablero;
        tablero = computer.giveTurn(principal);
        checkIfEmpty(tablero.value[0][0], btn1);
        checkIfEmpty(tablero.value[0][1], btn2);
        checkIfEmpty(tablero.value[0][2], btn3);
        checkIfEmpty(tablero.value[1][0], btn4);
        checkIfEmpty(tablero.value[1][1], btn5);
        checkIfEmpty(tablero.value[1][2], btn6);
        checkIfEmpty(tablero.value[2][0], btn7);
        checkIfEmpty(tablero.value[2][1], btn8);
        checkIfEmpty(tablero.value[2][2], btn9);
        if(principal.findIfWon() == com) {
            Intent winner = new Intent(GameNActivity.this, EndActivity.class);
            winner.putExtra("Winner", com);
            winner.putExtra("manPlay", man);
            winner.putExtra("comPlay", com);
            winner.putExtra("diff", 'N');
            startActivity(winner);
        }else if(principal.findIfWon() == 'D') {
            Intent winner = new Intent(GameNActivity.this, EndActivity.class);
            winner.putExtra("Winner", 'D');
            winner.putExtra("manPlay", man);
            winner.putExtra("comPlay", com);
            winner.putExtra("diff", 'N');
            startActivity(winner);
        }
    }

    public void checkIfEmpty(char slot, Button btn) {
        if(slot == 'X') {
            btn.setBackgroundResource(R.mipmap.cross);
            btn.setEnabled(false);
        }else if(slot == 'O') {
            btn.setBackgroundResource(R.mipmap.nought);
            btn.setEnabled(false);
        }
    }

    public class Tab {
        public char value[][] = new char [3][3];
        public Tab childTabs[];
        public char decision = 'N';
        public int counterCom = 0, counterMan = 0, counterDraw = 0;

        public void initialize() {
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    value[i][j] = ' ';
                }
            }
        }

        /*public void childSum(Tab child) {
            if(child.findIfWon() == com) {
                this.counterCom += child.counterCom;
            }
            if(child.findIfWon() == man) {
                this.counterMan += child.counterMan;
            }
            if(child.findIfWon() == 'D') {
                this.counterDraw += child.counterDraw;
            }
        }*/

        public void copyValues(Tab tmp) {
            //childSum(tmp);
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    value[i][j] = tmp.value[i][j];
                }
            }
        }

        public void initializeChildTabs(int total) {
            childTabs = new Tab[total];
            for(int i = 0; i < total; i++) {
                childTabs[i] = new Tab();
                childTabs[i].initialize();
            }
        }

        public int countEmpty() {
            int counter = 0;

            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    if(value[i][j] == ' ') {
                        counter++;
                    }
                }
            }
            return counter;
        }

        public void putValue(int loc, char id) {
            int counter = 0;

            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    if(value[i][j] == ' ' && loc == counter) {
                        value[i][j] = id;
                        return;
                    }else if(value[i][j] == ' ') {
                        counter++;
                    }
                }
                //this.childSum(this);
            }
        }

        public char findIfWon() {
            char tmp;
            tmp = vertical();
            if(tmp == 'X' || tmp == 'O') {
                return tmp;
            }
            tmp = horizontal();
            if(tmp == 'X' || tmp == 'O') {
                return tmp;
            }
            tmp = diagonal();
            if(tmp == 'X' || tmp == 'O') {
                return tmp;
            }
            if(draw()) {
                return 'D';
            }
            return 'N';
        }

        public char findIfNear() {
            for(int i = 0; i < 3; i++) {
                if(value[0][i] == value[1][i] || value[1][i] == value[2][i] || value[0][i] == value[2][i]) {
                    if(value[0][i] == ' ')
                        return value[1][i];
                    if(value[1][i] == ' ')
                        return value[2][i];
                    if(value[2][i] == ' ')
                        return value[0][i];
                }
                if(value[i][0] == value[i][1] || value[i][1] == value[i][2] || value[i][0] == value[i][2]) {
                    if(value[i][0] == ' ')
                        return value[i][1];
                    if(value[i][1] == ' ')
                        return value[i][2];
                    if(value[i][2] == ' ')
                        return value[i][0];
                }
                if(draw()) {
                    return 'D';
                }
                if(value[0][0] == value[1][1] || value[1][1] == value[2][2] || value[0][0] == value[2][2]) {
                    if(value[0][0] == ' ')
                        return value[1][1];
                    if(value[1][1] == ' ')
                        return value[2][2];
                    if(value[2][2] == ' ')
                        return value[0][0];
                }
                if(value[0][2] == value[1][1] || value[1][1] == value[2][0] || value[0][2] == value[2][0]) {
                    if(value[0][2] == ' ')
                        return value[1][1];
                    if(value[1][1] == ' ')
                        return value[2][0];
                    if(value[2][0] == ' ')
                        return value[0][2];
                }
            }
            return 'N';
        }

        public boolean draw() {
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    if(value[i][j] == ' ') {
                        return false;
                    }
                }
            }
            return true;
        }

        public char vertical() {
            for(int i = 0; i < 3; i++) {
                if(value[0][i] == value[1][i] && value[1][i] == value[2][i] && value[1][i] != ' ') {
                    return value[1][i];
                }
            }
            return 'N';
        }

        public char horizontal() {
            for(int i = 0; i < 3; i++) {
                if(value[i][0] == value[i][1] && value[i][1] == value[i][2] && value[i][0] != ' ') {
                    return value[i][0];
                }
            }
            return 'N';
        }

        public char diagonal() {
            if(value[0][0] == value[1][1] && value[1][1] == value[2][2] && value[1][1] != ' ') {
                return value[1][1];
            }
            if(value[0][2] == value[1][1] && value[1][1] == value[2][0] && value[1][1] != ' ') {
                return value[1][1];
            }
            return 'N';
        }

        public void putIntoTab(int i, int j, char player) {
            value[i][j] = player;
            //this.childSum(this);
        }
    }

    public class Com {
        private int count;
        private Tab maxTab = new Tab();

        protected Tab giveTurn(Tab mainTab) {
            Tab tmpTab = new Tab();
            tmpTab.copyValues(mainTab);
            maxTab.initializeChildTabs(mainTab.countEmpty());
            findMax(tmpTab, 0);
            //maxTab.childSum(maxTab);
            mainTab.copyValues(maxTab);
            return mainTab;
        }

        protected int findMax(Tab curTab, int level) { //niveles pares
            char curState;
            curState = curTab.findIfWon();
            curTab.decision = curState;

            if(curState == com) {
                curTab.counterCom++;
                return 10;
            }else if(curState == 'D') {
                curTab.counterDraw++;
                return 0;
            }else if(curState != 'N') {
                curTab.counterMan++;
                return -10;
            }

            int posMoves = curTab.countEmpty();
            //curTab.childSum(curTab);

            curTab.initializeChildTabs(posMoves);
            int maxVal = -99999;

            if(level < 6) {
                for(int i = 0; i < posMoves; i++) {
                    Tab tmpTab = new Tab();
                    tmpTab.copyValues(curTab);
                    tmpTab.putValue(i, com);
                    //tmpTab.childSum(tmpTab);
                    curTab.childTabs[i].copyValues(tmpTab);

                    int tmpVal = findMin(tmpTab, level + 1);

                    if(tmpVal >= maxVal) {
                        maxVal = tmpVal;
                        if(level == 0) {
                            maxTab.copyValues(tmpTab);
                            //maxTab.childSum(tmpTab);
                        }
                    }
                }
            }
            else {
                //curTab.findIfNear();
                //curTab.decision = curState;
                for(int i = 0; i < posMoves; i++) {
                    Tab tmpTab = new Tab();
                    tmpTab.copyValues(curTab);
                    tmpTab.putValue(i, com);
                    //tmpTab.childSum(tmpTab);
                    curTab.childTabs[i].copyValues(tmpTab);
                    if(curTab.childTabs[i].findIfNear() == com) {
                        curTab.counterCom++;
                        maxTab.copyValues(tmpTab);
                        return 10;
                    }else if(curTab.childTabs[i].findIfNear() == 'D') {
                        curTab.counterDraw++;
                        return 0;
                    }else if(curTab.childTabs[i].findIfNear() != 'N') {
                        curTab.counterMan++;
                        return -10;
                    }
                }
            }
            return maxVal;
        }

        protected int findMin(Tab curTab, int level) { //niveles nones
            char curState;
            curState = curTab.findIfWon();
            curTab.decision = curState;

            if(curState == com) {
                curTab.counterCom++;
                return 10;
            }else if(curState == 'D') {
                curTab.counterDraw++;
                return 0;
            }else if(curState != 'N') {
                curTab.counterMan++;
                return -10;
            }

            int posMoves = curTab.countEmpty();
            //curTab.childSum(curTab);
            curTab.initializeChildTabs(posMoves);
            int minVal = 999999;
            for(int i = 0; i < posMoves; i++) {
                Tab tmpTab = new Tab();
                tmpTab.copyValues(curTab);
                tmpTab.putValue(i, man);
                //tmpTab.childSum(tmpTab);
                curTab.childTabs[i].copyValues(tmpTab);
                minVal = Math.min(minVal, findMax(tmpTab, level + 1));
            }
            return minVal;
        }
    }
}