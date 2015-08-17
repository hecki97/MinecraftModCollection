package net.minecraft.src;

import java.awt.image.BufferedImage;

import org.lwjgl.opengl.GL11;

public class GuiAdventure extends GuiScreen
{
	 
    private BufferedImage img;
    private int imgID = 1000;
    private int page = 0;
    private GuiButton disabled;
   
    public void initGui()
    {
             try {
             
         mc.renderEngine.setupTexture(img, imgID);
        } catch (Exception e) {
         e.printStackTrace();
        }
                    controlList.clear();
                    tabs();
                   
                   
                    switch(page){
                    case 0:
                            controlList.add(new GuiButton(1, width / 2 - 90, height / 2 + 20, 160, 20, "Start"));
                           
                            break;
                    case 1:
                    	controlList.add(disabled = new GuiButton(99, width / 2 - 90, height / 2 - 10, 160, 20, "Die Insel"));
                    	 disabled.drawButton = true;
                    	 disabled.enabled = true;
                    	
                   	 controlList.add(disabled = new GuiButton(80, width / 2 - 90, height / 2 + 20, 160, 20, "Das Verlies"));
                   	 disabled.drawButton = true;
                	 disabled.enabled = false;
                    	controlList.add(disabled = new GuiButton(98, width / 2 - 90, height / 2 + 50, 160, 20, "Tutorial"));
                        
                        break;
                    case 2:
                            
                            controlList.add(new GuiButton(2, width / 2 - 90, height / 2 - 10, 160, 20, "Kapitel 1"));
                           
                            controlList.add(disabled = new GuiButton(3, width / 2 - 90, height / 2 + 20, 160, 20, "Kapitel 2"));
                            disabled.drawButton = true;
                            	 disabled.enabled = false;
                            	 controlList.add(new GuiButton(50, width / 2 - 90, height / 2 + 75, 80, 20, "<--"));
                            	 controlList.add(disabled = new GuiButton(49, width / 2 - 10, height / 2 + 75, 80, 20, "-->"));
                                 disabled.drawButton = true;
                                 	 disabled.enabled = false;
                            controlList.add(disabled = new GuiButton(4, width / 2 - 90, height / 2 + 50, 160, 20, "Kapitel 3"));
                            disabled.drawButton = true;
                            disabled.enabled = false;
                            break;
                            
                    case 3:
                    	 controlList.add(new GuiButton(5, width / 2 - 90, height / 2 + 20, 160, 20, "sich erst mal umschauen"));
                    	 controlList.add(new GuiButton(6, width / 2 - 90, height / 2 + 50, 160, 20, "sich am Strand ausruhen"));
                    break;
                    case 4:
                    	controlList.add(new GuiButton(7, width / 2 - 90, height / 2 + 20, 160, 20, "Holz für ein Feuer sammeln"));
                   	 controlList.add(new GuiButton(8, width / 2 - 90, height / 2 + 50, 160, 20, "sich den Ort anschauen"));
                   	 break;
                    case 5:
                    	controlList.add(new GuiButton(9, width / 2 - 90, height / 2 + 20, 160, 20, "nach etwas zu trinken suchen"));
                   	 controlList.add(new GuiButton(10, width / 2 - 90, height / 2 + 50, 160, 20, "nichts tun"));
                   	 break;
                   
                    case 7:
                    	controlList.add(new GuiButton(13, width / 2 - 90, height / 2 + 20, 160, 20, "einfach reingehen"));
                     	 controlList.add(new GuiButton(14, width / 2 - 90, height / 2 + 50, 160, 20, "du markierst dir deinen Weg"));
                     	 break;
                    case 8:
                    	 controlList.add(new GuiButton(15, width / 2 - 90, height / 2 + 20, 160, 20, "auf den Weg machen"));
                    	 break;
                    case 9:
                    	controlList.add(new GuiButton(16, width / 2 - 90, height / 2 + 65, 160, 20, "nocheinmal versuchen"));
                   	 break;
                    
                    case 10:
                    	controlList.add(new GuiButton(17, width / 2 - 90, height / 2 + 65, 160, 20, "weiter"));
                      	 break;
                    
                    case 11:
                    	controlList.add(new GuiButton(18, width / 2 - 90, height / 2 + 65, 160, 20, "weiter"));
                     	 break;
                    
                    case 12:
                    	controlList.add(new GuiButton(19, width / 2 - 90, height / 2 + 25, 160, 20, "zum Menü"));
                    	controlList.add(disabled = new GuiButton(20, width / 2 - 90, height / 2 + 45, 160, 20, "zu Kapitel 2"));
                    	disabled.drawButton = true;
                   	 disabled.enabled = false; 
                    	break;
                     	 
                    
                    case 99:
                    	controlList.add(new GuiButton(97, width / 2 - 90, height / 2 + 65, 160, 20, "weiter"));
                   	 break;
                    
                    case 98:
                    	controlList.add(new GuiButton(96, width / 2 - 90, height / 2 + 75, 160, 20, "weiter"));
                    	controlList.add(new GuiButton(95, width / 2 - 90, height / 2 + 20, 160, 20, "du stellst eine Diamant Hoe her"));
                    	 controlList.add(new GuiButton(94, width / 2 - 90, height / 2 + 50, 160, 20, "du stellst ein Dia Schwert her")); 
                    	break;
                    
                    case 97:
                    	controlList.add(new GuiButton(93, width / 2 - 90, height / 2 + 20, 160, 20, "du stellst eine Diamant Hoe her"));
                   	 controlList.add(new GuiButton(92, width / 2 - 90, height / 2 + 50, 160, 20, "du stellst ein Dia Schwert her"));
                   	 break;
                    
                    case 96:
                    	controlList.add(new GuiButton(91, width / 2 - 90, height / 2 + 65, 160, 20, "weiter"));
                      	 break;
                    
                    }	
    }
   
    private void tabs() {
           
            
           
           
           
    }

    protected void actionPerformed(GuiButton guibutton)
    {
    	
    	if(guibutton.id == 1)
            {
                   page = 1;
                   initGui();
            }
    	if(guibutton.id == 50)
        {
               page = 1;
               initGui();
        }
            if(guibutton.id == 99)
            {
                   page = 2;
                   initGui();
            }
            if(guibutton.id == 2)
            {
            	page = 3;
            	initGui();
            }
            if(guibutton.id == 5)
            {
                   page = 4;
                   initGui();
            }
            if(guibutton.id == 6)
            {
            	page = 5;
            	initGui();
            }
            if(guibutton.id == 7)
            {
            	page = 7;
            	initGui();
            }
            if(guibutton.id == 10)
            {
            	page = 8;
            	initGui();
            }
            if(guibutton.id == 9)
            {
            	page = 4;
                initGui();
            }
            if(guibutton.id == 13)
            {
            	page = 9;
                initGui();
            }
            if(guibutton.id == 14)
            {
            	page = 10;
                initGui();
            }
            if(guibutton.id == 15)
            {
            	page = 4;
                initGui();
            }
            if(guibutton.id == 16)
            {
            	page = 2;
                initGui();
            }
            if(guibutton.id == 17)
            {
            	page = 11;
                initGui();
            }
            if(guibutton.id == 18)
            {
            	page = 12;
                initGui();
            }
            if(guibutton.id == 19)
            {
            	page = 2;
                initGui();
            }
            if(guibutton.id == 98)
            {
            	page = 99;
            	initGui();
            
            }
            if(guibutton.id == 97)
            {
            	page = 98;
            	initGui();
            }
            if(guibutton.id == 96)
            {
            	page = 97;
            	initGui();
            
            }
            if(guibutton.id == 93)
            {
            	page = 96;
            	initGui();
            
            }
            if(guibutton.id == 92)
            {
            	page = 96;
            	initGui();
            
            }
            if(guibutton.id == 91)
            {
            	page = 1;
            	initGui();
            
            }
    }
   
    public boolean doesGuiPauseGame()
    {
            return false;
    }
   
    public void drawScreen(int i, int j, float f)
    {
            drawDefaultBackground();
             int x = width / 2 - 97;
     int y = height / 2 - 60;
     try{
         int adventureblock = mc.renderEngine.getTexture("/adventureblock/gui.png");
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         mc.renderEngine.bindTexture(adventureblock);
         drawTexturedModalRect(x, y, 0, 0, 176, 166);
    }
    finally {
    }
    GL11.glPushMatrix();
    GL11.glScalef(2.0F, 2.0F, 2.0F);	
            drawCenteredString(fontRenderer, "Adventure Block", width / 4, height / 4 - 50, 0x44ff11);
            GL11.glPopMatrix();
           
            switch(page){
            case 1:
            	drawCenteredString(fontRenderer, "Wähle eine Geschichte", width / 2, height / 2 - 50, 0xCCCCCC);
            	drawCenteredString(fontRenderer, "weitere kommen bald", width / 2, height / 2 + 80, 0xCCCCCC);
            	break;
            case 2:
            	drawCenteredString(fontRenderer, "Die Insel", width / 2, height / 2 - 50, 0xCCCCCC);    
            	drawString(fontRenderer, "Wähle ein Kapitel", width / 2 - 50, height / 2 - 20, 0xCCCCCC);
                    break;
            case 3:
            	drawCenteredString(fontRenderer, "Du strandest auf einer Insel", width / 2, height / 2 - 50, 0xCCCCCC);
            	drawCenteredString(fontRenderer, "was machst du?", width / 2, height / 2 - 40, 0xCCCCCC);
            	break;
            case 4:
            	drawCenteredString(fontRenderer, "Du findest eine verlassene", width / 2, height / 2 - 50, 0xCCCCCC);
            	drawCenteredString(fontRenderer, "Lagerstätte was machst du?", width / 2, height / 2 - 40, 0xCCCCCC);
            	break;
            case 5:
            	drawCenteredString(fontRenderer, "Du bekommst nach einiger", width / 2, height / 2 - 50, 0xCCCCCC);
            	drawCenteredString(fontRenderer, "Zeit Durst was machst du?", width / 2, height / 2 - 40, 0xCCCCCC);
            	break;
            
            case 7:
            	drawCenteredString(fontRenderer, "Du kommst zu einem Wald", width / 2, height / 2 - 50, 0xCCCCCC);
            	drawCenteredString(fontRenderer, "was machst du?", width / 2, height / 2 - 40, 0xCCCCCC);
            	break;
            case 8:
            	drawCenteredString(fontRenderer, "Nachdem du einige Zeit", width / 2, height / 2 - 50, 0xCCCCCC);
            	drawCenteredString(fontRenderer, "gewartet hast machst du", width / 2, height / 2 - 40, 0xCCCCCC);
            	drawCenteredString(fontRenderer, "auf die Suche um etwas", width / 2, height / 2 - 30, 0xCCCCCC);
            	drawCenteredString(fontRenderer, "zum trinken zu finden", width / 2, height / 2 - 20, 0xCCCCCC);
            	break;
            
            case 9:
            	drawCenteredString(fontRenderer, "Du findest viele Holz", width / 2, height / 2 - 50, 0xCCCCCC);
            	drawCenteredString(fontRenderer, "als du dich aber auf", width / 2, height / 2 - 40, 0xCCCCCC);
            	drawCenteredString(fontRenderer, "den Rückweg machen ", width / 2, height / 2 - 30, 0xCCCCCC);
            	drawCenteredString(fontRenderer, "möchtest stellst du", width / 2, height / 2 - 20, 0xCCCCCC);
            	drawCenteredString(fontRenderer, "fest das du dich ver", width / 2, height / 2 - 10, 0xCCCCCC);
            	drawCenteredString(fontRenderer, "laufen hast", width / 2, height / 2 - 0, 0xCCCCCC);
            	drawCenteredString(fontRenderer, "DEINE REISE ENDET HIER", width / 2, height / 2 + 30, 0x9A0000);
            	drawCenteredString(fontRenderer, "VERSUCH ES NOCHEINMAL", width / 2, height / 2 + 40, 0x9A0000);
            	break;
            case 10:
            	drawCenteredString(fontRenderer, "Du findest viele Holz", width / 2, height / 2 - 50, 0xCCCCCC);
            	drawCenteredString(fontRenderer, "als du dich auf", width / 2, height / 2 - 40, 0xCCCCCC);
            	drawCenteredString(fontRenderer, "den Rückweg machen ", width / 2, height / 2 - 30, 0xCCCCCC);
            	drawCenteredString(fontRenderer, "möchtest stellst du", width / 2, height / 2 - 20, 0xCCCCCC);
            	drawCenteredString(fontRenderer, "fest das du dank der", width / 2, height / 2 - 10, 0xCCCCCC);
            	drawCenteredString(fontRenderer, "Spur unbeschadet aus dem", width / 2, height / 2 - 0, 0xCCCCCC);
            	drawCenteredString(fontRenderer, "Wald kommst", width / 2, height / 2 + 10, 0xCCCCCC);
            	drawCenteredString(fontRenderer, "Es wird langsam Abend ", width / 2, height / 2 + 30, 0xCCCCCC);
            	drawCenteredString(fontRenderer, "und du machst dich auf", width / 2, height / 2 + 40, 0xCCCCCC);
            	drawCenteredString(fontRenderer, "den Rückweg zum Lager ", width / 2, height / 2 + 50, 0xCCCCCC);
            	break;
            
            case 11:
            	drawCenteredString(fontRenderer, "Du kommst am Lager an", width / 2, height / 2 - 50, 0xCCCCCC);
            	drawCenteredString(fontRenderer, "zündest dir mit dem", width / 2, height / 2 - 40, 0xCCCCCC);
            	drawCenteredString(fontRenderer, "gefundenen Holz ein", width / 2, height / 2 - 30, 0xCCCCCC);
            	drawCenteredString(fontRenderer, "Lagerfeuer an", width / 2, height / 2 - 20, 0xCCCCCC);
            	drawCenteredString(fontRenderer, "Als es Abend wird", width / 2, height / 2 - 10, 0xCCCCCC);
            	drawCenteredString(fontRenderer, "suchst du dir eine", width / 2, height / 2 - 0, 0xCCCCCC);
            	drawCenteredString(fontRenderer, "schöne Stelle unter", width / 2, height / 2 + 10, 0xCCCCCC);
            	drawCenteredString(fontRenderer, "einer Palme und ", width / 2, height / 2 + 30, 0xCCCCCC);
            	drawCenteredString(fontRenderer, "schläfst ein", width / 2, height / 2 + 40, 0xCCCCCC);
            	break;
            
            case 12:
            	drawCenteredString(fontRenderer, "Herzlichen Glückwunsch", width / 2, height / 2 - 40, 0x006b2d);
            	drawCenteredString(fontRenderer, "du hast Tag 1 überlebt", width / 2, height / 2 - 30, 0x006b2d);
            	drawCenteredString(fontRenderer, "und das Kapitel abge", width / 2, height / 2 - 20, 0x006b2d);
            	drawCenteredString(fontRenderer, "schlossen", width / 2, height / 2 - 10, 0x006b2d);
            break;
            
            case 99:
            	drawCenteredString(fontRenderer, "Tutorial", width / 2, height / 2 - 50, 0x44ff11);
            	drawCenteredString(fontRenderer, "Du findest zwei Diamanten", width / 2, height / 2 - 40, 0xCCCCCC);
            	drawCenteredString(fontRenderer, "was machst du?", width / 2, height / 2 - 30, 0xCCCCCC);
            	drawCenteredString(fontRenderer, "Dies ist eine Frage die", width / 2, height / 2 - 10, 0x9A0000);
            	drawCenteredString(fontRenderer, "sehr oft gestellt bekommst", width / 2, height / 2 - 0, 0x9A0000);
            	drawCenteredString(fontRenderer, "Meistens hast du zwei ", width / 2, height / 2 + 10, 0x9A0000);
            	drawCenteredString(fontRenderer, "Antwortmöglichkeiten", width / 2, height / 2 + 20, 0x9A0000);
            	drawCenteredString(fontRenderer, "Klicke auf weiter um", width / 2, height / 2 + 30, 0x9A0000);
            	drawCenteredString(fontRenderer, "fortzufahren", width / 2, height / 2 + 40, 0x9A0000);
            	break;
            
            case 98:
            	drawCenteredString(fontRenderer, "Tutorial", width / 2, height / 2 - 50, 0x44ff11);
            	drawCenteredString(fontRenderer, "Um eine Antwort auszu", width / 2, height / 2 - 40, 0x9A0000);
            	drawCenteredString(fontRenderer, "wählen, klicke einfach", width / 2, height / 2 - 30, 0x9A0000);
            	drawCenteredString(fontRenderer, "darauf", width / 2, height / 2 - 20, 0x9A0000);
            break;
            
            case 97:
            	drawCenteredString(fontRenderer, "Jetzt bist du dran", width / 2, height / 2 - 50, 0x9A0000);
            	drawCenteredString(fontRenderer, "Du findest zwei Diamanten", width / 2, height / 2 - 40, 0xCCCCCC);
            	drawCenteredString(fontRenderer, "was machst du?", width / 2, height / 2 - 30, 0xCCCCCC);
            break;
            
            case 96:
            	drawCenteredString(fontRenderer, "Herzlichen Glückwunsch", width / 2, height / 2 - 40, 0x9A0000);
            	drawCenteredString(fontRenderer, "du hast das Tutorial ab-", width / 2, height / 2 - 30, 0x9A0000);
            	drawCenteredString(fontRenderer, "geschlossen", width / 2, height / 2 - 20, 0x9A0000);
            	drawCenteredString(fontRenderer, "Klicke auf weiter um", width / 2, height / 2 + 30, 0x9A0000);
            	drawCenteredString(fontRenderer, "zum Hauptmenü zurück", width / 2, height / 2 + 40, 0x9A0000);
            	drawCenteredString(fontRenderer, "zu kehren", width / 2, height / 2 + 50, 0x9A0000);
            	break;
            }
            
           
            super.drawScreen(i, j, f);
    }
}