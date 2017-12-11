package com.jware.gatoapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameHActivity extends Activity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    char man, com;
    Com computer = new Com();
    Tab principal = new Tab();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_h);

        man = getIntent().getCharExtra("manPlay", 'O');
        com = getIntent().getCharExtra("comPlay", 'X');
        principal.initialize();

        btn1 = (Button) findViewById(R.id.btnh1);
        btn2 = (Button) findViewById(R.id.btnh2);
        btn3 = (Button) findViewById(R.id.btnh3);
        btn4 = (Button) findViewById(R.id.btnh4);
        btn5 = (Button) findViewById(R.id.btnh5);
        btn6 = (Button) findViewById(R.id.btnh6);
        btn7 = (Button) findViewById(R.id.btnh7);
        btn8 = (Button) findViewById(R.id.btnh8);
        btn9 = (Button) findViewById(R.id.btnh9);

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
        if(v.getId() == R.id.btnh1) {
            //btn1.setText(man + "");
            btn1.setEnabled(false);
            principal.putIntoTab(0, 0, man);
            if(principal.findIfWon() == man) {
                Intent winner = new Intent(GameHActivity.this, EndActivity.class);
                winner.putExtra("Winner", man);
                winner.putExtra("manPlay", man);
                winner.putExtra("comPlay", com);
                winner.putExtra("diff", 'H');
                startActivity(winner);
            }else if(principal.findIfWon() == 'D') {
                Intent winner = new Intent(GameHActivity.this, EndActivity.class);
                winner.putExtra("Winner", 'D');
                winner.putExtra("manPlay", man);
                winner.putExtra("comPlay", com);
                winner.putExtra("diff", 'H');
                startActivity(winner);
            }
            computerTurn();
        }else if(v.getId() == R.id.btnh2) {
            //btn2.setText(man + "");
            btn2.setEnabled(false);
            principal.putIntoTab(0, 1, man);
            if(principal.findIfWon() == man) {
                Intent winner = new Intent(GameHActivity.this, EndActivity.class);
                winner.putExtra("Winner", man);
                winner.putExtra("manPlay", man);
                winner.putExtra("comPlay", com);
                winner.putExtra("diff", 'H');
                startActivity(winner);
            }else if(principal.findIfWon() == 'D') {
                Intent winner = new Intent(GameHActivity.this, EndActivity.class);
                winner.putExtra("Winner", 'D');
                winner.putExtra("manPlay", man);
                winner.putExtra("comPlay", com);
                winner.putExtra("diff", 'H');
                startActivity(winner);
            }
            computerTurn();
        }else if(v.getId() == R.id.btnh3) {
            //btn3.setText(man + "");
            btn3.setEnabled(false);
            principal.putIntoTab(0, 2, man);
            if(principal.findIfWon() == man) {
                Intent winner = new Intent(GameHActivity.this, EndActivity.class);
                winner.putExtra("Winner", man);
                winner.putExtra("manPlay", man);
                winner.putExtra("comPlay", com);
                winner.putExtra("diff", 'H');
                startActivity(winner);
            }else if(principal.findIfWon() == 'D') {
                Intent winner = new Intent(GameHActivity.this, EndActivity.class);
                winner.putExtra("Winner", 'D');
                winner.putExtra("manPlay", man);
                winner.putExtra("comPlay", com);
                winner.putExtra("diff", 'H');
                startActivity(winner);
            }
            computerTurn();
        }else if(v.getId() == R.id.btnh4) {
            //btn4.setText(man + "");
            btn4.setEnabled(false);
            principal.putIntoTab(1, 0, man);
            if(principal.findIfWon() == man) {
                Intent winner = new Intent(GameHActivity.this, EndActivity.class);
                winner.putExtra("Winner", man);
                winner.putExtra("manPlay", man);
                winner.putExtra("comPlay", com);
                winner.putExtra("diff", 'H');
                startActivity(winner);
            }else if(principal.findIfWon() == 'D') {
                Intent winner = new Intent(GameHActivity.this, EndActivity.class);
                winner.putExtra("Winner", 'D');
                winner.putExtra("manPlay", man);
                winner.putExtra("comPlay", com);
                winner.putExtra("diff", 'H');
                startActivity(winner);
            }
            computerTurn();
        }else if(v.getId() == R.id.btnh5) {
            //btn5.setText(man + "");
            btn5.setEnabled(false);
            principal.putIntoTab(1, 1, man);
            if(principal.findIfWon() == man) {
                Intent winner = new Intent(GameHActivity.this, EndActivity.class);
                winner.putExtra("Winner", man);
                winner.putExtra("manPlay", man);
                winner.putExtra("comPlay", com);
                winner.putExtra("diff", 'H');
                startActivity(winner);
            }else if(principal.findIfWon() == 'D') {
                Intent winner = new Intent(GameHActivity.this, EndActivity.class);
                winner.putExtra("Winner", 'D');
                winner.putExtra("manPlay", man);
                winner.putExtra("comPlay", com);
                winner.putExtra("diff", 'H');
                startActivity(winner);
            }
            computerTurn();
        }else if(v.getId() == R.id.btnh6) {
            //btn6.setText(man + "");
            btn6.setEnabled(false);
            principal.putIntoTab(1, 2, man);
            if(principal.findIfWon() == man) {
                Intent winner = new Intent(GameHActivity.this, EndActivity.class);
                winner.putExtra("Winner", man);
                winner.putExtra("manPlay", man);
                winner.putExtra("comPlay", com);
                winner.putExtra("diff", 'H');
                startActivity(winner);
            }else if(principal.findIfWon() == 'D') {
                Intent winner = new Intent(GameHActivity.this, EndActivity.class);
                winner.putExtra("Winner", 'D');
                winner.putExtra("manPlay", man);
                winner.putExtra("comPlay", com);
                winner.putExtra("diff", 'H');
                startActivity(winner);
            }
            computerTurn();
        }else if(v.getId() == R.id.btnh7) {
            //btn7.setText(man + "");
            btn7.setEnabled(false);
            principal.putIntoTab(2, 0, man);
            if(principal.findIfWon() == man) {
                Intent winner = new Intent(GameHActivity.this, EndActivity.class);
                winner.putExtra("Winner", man);
                winner.putExtra("manPlay", man);
                winner.putExtra("comPlay", com);
                winner.putExtra("diff", 'H');
                startActivity(winner);
            }else if(principal.findIfWon() == 'D') {
                Intent winner = new Intent(GameHActivity.this, EndActivity.class);
                winner.putExtra("Winner", 'D');
                winner.putExtra("manPlay", man);
                winner.putExtra("comPlay", com);
                winner.putExtra("diff", 'H');
                startActivity(winner);
            }
            computerTurn();
        }else if(v.getId() == R.id.btnh8) {
            //btn8.setText(man + "");
            btn8.setEnabled(false);
            principal.putIntoTab(2, 1, man);
            if(principal.findIfWon() == man) {
                Intent winner = new Intent(GameHActivity.this, EndActivity.class);
                winner.putExtra("Winner", man);
                winner.putExtra("manPlay", man);
                winner.putExtra("comPlay", com);
                winner.putExtra("diff", 'H');
                startActivity(winner);
            }else if(principal.findIfWon() == 'D') {
                Intent winner = new Intent(GameHActivity.this, EndActivity.class);
                winner.putExtra("Winner", 'D');
                winner.putExtra("manPlay", man);
                winner.putExtra("comPlay", com);
                winner.putExtra("diff", 'H');
                startActivity(winner);
            }
            computerTurn();
        }
        else {
            //btn9.setText(man + "");
            btn9.setEnabled(false);
            principal.putIntoTab(2, 2, man);
            if(principal.findIfWon() == man) {
                Intent winner = new Intent(GameHActivity.this, EndActivity.class);
                winner.putExtra("Winner", man);
                winner.putExtra("manPlay", man);
                winner.putExtra("comPlay", com);
                winner.putExtra("diff", 'H');
                startActivity(winner);
            }else if(principal.findIfWon() == 'D') {
                Intent winner = new Intent(GameHActivity.this, EndActivity.class);
                winner.putExtra("Winner", 'D');
                winner.putExtra("manPlay", man);
                winner.putExtra("comPlay", com);
                winner.putExtra("diff", 'H');
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
            Intent winner = new Intent(GameHActivity.this, EndActivity.class);
            winner.putExtra("Winner", com);
            winner.putExtra("manPlay", man);
            winner.putExtra("comPlay", com);
            winner.putExtra("diff", 'H');
            startActivity(winner);
        }else if(principal.findIfWon() == 'D') {
            Intent winner = new Intent(GameHActivity.this, EndActivity.class);
            winner.putExtra("Winner", 'D');
            winner.putExtra("manPlay", man);
            winner.putExtra("comPlay", com);
            winner.putExtra("diff", 'H');
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

        public void initialize() {
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    value[i][j] = ' ';
                }
            }
        }

        public void copyValues(Tab tmp) {
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
        }
    }

    public class Com {
        //protected char identity = com;
        private Tab maxTab = new Tab();

        protected Tab giveTurn(Tab mainTab) {
            Tab tmpTab = new Tab();
            tmpTab.copyValues(mainTab);

            findMax(tmpTab, 0);
            mainTab.copyValues(maxTab);
            return mainTab;
        }

        protected int findMax(Tab curTab, int level) {
            char curState;
            curState = curTab.findIfWon();
            curTab.decision = curState;

            if(curState == com) {
                return 10;
            }else if(curState == 'D') {
                return 0;
            }else if(curState != 'N') {
                return -10;
            }

            int posMoves = curTab.countEmpty();
            curTab.initializeChildTabs(posMoves);
            int maxVal = -99999;
            for(int i = 0; i < posMoves; i++) {
                Tab tmpTab = new Tab();
                tmpTab.copyValues(curTab);
                tmpTab.putValue(i, com);
                curTab.childTabs[i].copyValues(tmpTab);

                int tmpVal = findMin(tmpTab, level + 1);

                if(tmpVal >= maxVal) {
                    maxVal = tmpVal;
                    if(level == 0) {
                        maxTab.copyValues(tmpTab);
                    }
                }
            }
            return maxVal;
        }

        protected int findMin(Tab curTab, int level) {
            char curState;
            curState = curTab.findIfWon();
            curTab.decision = curState;

            if(curState == com) {
                return 10;
            }else if(curState == 'D') {
                return 0;
            }else if(curState != 'N') {
                return -10;
            }

            int posMoves = curTab.countEmpty();
            curTab.initializeChildTabs(posMoves);
            int minVal = 999999;
            for(int i = 0; i < posMoves; i++) {
                Tab tmpTab = new Tab();
                tmpTab.copyValues(curTab);
                tmpTab.putValue(i, man);
                curTab.childTabs[i].copyValues(tmpTab);
                minVal = Math.min(minVal, findMax(tmpTab, level + 1));
            }
            return minVal;
        }
    }
}
