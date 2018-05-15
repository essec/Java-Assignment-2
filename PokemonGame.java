import java.awt.Container;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class PokemonGame extends JFrame{

	

	private static final long serialVersionUID = 1L;
	ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
	int membershipOfChokorita,
		membershipOfCyndaquill,
		membershipOfTotodile;
	
	JTextArea statusArea;

	public String pokemonStatus(int member){
		String status = "Pokemon : " + this.pokemons.get(member).getName() +  "\n" +
						"Weight : " + this.pokemons.get(member).getWeight() + "\n" +
						"Mood : " + this.pokemons.get(member).getMood() + "\n" +
						"Health : " + this.pokemons.get(member).getHealth();
		

		return status;
	}
	
	public PokemonGame(){
		super("Pokegotchi");
		
		//set container
		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		//new sub layout
		JPanel header = new JPanel();
		JPanel center = new JPanel();
		JPanel footer = new JPanel();
		JPanel right = new JPanel();
		header.setLayout(new FlowLayout());			
		center.setLayout(new FlowLayout());
		footer.setLayout(new FlowLayout());

		c.add(header, BorderLayout.NORTH);
        c.add(center, BorderLayout.CENTER);
        c.add(footer, BorderLayout.SOUTH);
		c.add(right, BorderLayout.EAST);
	
		//header
		JButton feedButton = new JButton("Feed");
		JButton walkButton = new JButton("Walk");
		JButton petButton = new JButton("Pet");
		JButton pokemonCenterButton = new JButton("Pokemon Center");
		JButton battleButton = new JButton("Battle!");

		pokemons.add(new Chikorita());
		pokemons.add(new Cyndaquil());
		pokemons.add(new Totodile());
		 
		membershipOfChokorita = 0;
		membershipOfCyndaquill = 1;
		membershipOfTotodile = 2;

		//setup image
		Icon iconWhite = new ImageIcon(getClass().getResource("vector.png"));
		JLabel iconPokemon = new JLabel("");
		Icon iconChikorita = new ImageIcon(getClass().getResource("icon_chicorita.gif"));
		Icon iconCyndaquil = new ImageIcon(getClass().getResource("icon_cyndaquil.gif"));
		Icon iconTotodile  = new ImageIcon(getClass().getResource("icon_totodile.gif_c200"));		
		iconPokemon.setIcon(iconWhite);


		//footer
		JLabel selectLabel = new JLabel("Select your pokemon: ");
        JRadioButton RBChikorita = new JRadioButton("Chikorita", false);
        JRadioButton RBCyndaquil = new JRadioButton("Cyndaquil", false);
        JRadioButton RBTotodile = new JRadioButton("Totodile", false);
        ButtonGroup radioGroup = new ButtonGroup();
            radioGroup.add(RBChikorita);
            radioGroup.add(RBCyndaquil);
			radioGroup.add(RBTotodile);

		//feed butt
		feedButton.addActionListener(new ActionListener(){
		
			@Override
			public void actionPerformed(ActionEvent e) {
				if(RBChikorita.isSelected()){
					pokemons.get(membershipOfChokorita).eat();
					iconPokemon.setIcon(iconChikorita);
					statusArea.setText(pokemonStatus(membershipOfChokorita));
				}
				else if(RBCyndaquil.isSelected()){
					pokemons.get(membershipOfCyndaquill).eat();
					statusArea.setText(pokemonStatus(membershipOfCyndaquill));
					iconPokemon.setIcon(iconCyndaquil);
				}

				else if(RBTotodile.isSelected()){
					pokemons.get(membershipOfTotodile).eat();
					statusArea.setText(pokemonStatus(membershipOfTotodile));
					iconPokemon.setIcon(iconTotodile);
				}
			}
		});


		walkButton.addActionListener(new ActionListener(){
		
			@Override
			public void actionPerformed(ActionEvent e) {
				if(RBChikorita.isSelected()){
					pokemons.get(membershipOfChokorita).move();
					statusArea.setText(pokemonStatus(membershipOfChokorita));
					iconPokemon.setIcon(iconChikorita);
				}
				else if(RBCyndaquil.isSelected()){
					pokemons.get(membershipOfCyndaquill).move();
					statusArea.setText(pokemonStatus(membershipOfCyndaquill));
					iconPokemon.setIcon(iconCyndaquil);
				}

				else if(RBTotodile.isSelected()){
					pokemons.get(membershipOfTotodile).move();
					statusArea.setText(pokemonStatus(membershipOfTotodile));
					iconPokemon.setIcon(iconTotodile);
				}
			}
		});

		petButton.addActionListener(new ActionListener(){
		
			@Override
			public void actionPerformed(ActionEvent e) {
				if(RBChikorita.isSelected()){
					petPokemon(membershipOfChokorita);
					statusArea.setText(pokemonStatus(membershipOfChokorita));
					iconPokemon.setIcon(iconChikorita);
				}
				else if(RBCyndaquil.isSelected()){
					petPokemon(membershipOfCyndaquill);
					statusArea.setText(pokemonStatus(membershipOfCyndaquill));
					iconPokemon.setIcon(iconCyndaquil);
				}

				else if(RBTotodile.isSelected()){
					petPokemon(membershipOfTotodile);
					statusArea.setText(pokemonStatus(membershipOfTotodile));
					iconPokemon.setIcon(iconTotodile);
				}
			}
		});

		pokemonCenterButton.addActionListener(new ActionListener(){
		
			@Override
			public void actionPerformed(ActionEvent e) {
				if(RBChikorita.isSelected()){
					pokemons.get(membershipOfChokorita).recovery();
					statusArea.setText(pokemonStatus(membershipOfChokorita));
					iconPokemon.setIcon(iconChikorita);
				}
				else if(RBCyndaquil.isSelected()){
					pokemons.get(membershipOfCyndaquill).recovery();
					statusArea.setText(pokemonStatus(membershipOfCyndaquill));
					iconPokemon.setIcon(iconCyndaquil);
				}

				else if(RBTotodile.isSelected()){
					pokemons.get(membershipOfTotodile).recovery();
					statusArea.setText(pokemonStatus(membershipOfTotodile));
					iconPokemon.setIcon(iconTotodile);
				}
			}
		});

		battleButton.addActionListener(new ActionListener(){
		
			@Override
			public void actionPerformed(ActionEvent e) {
				if(RBChikorita.isSelected()){
					pokemons.get(membershipOfChokorita).battle();
					statusArea.setText(pokemonStatus(membershipOfChokorita));
					iconPokemon.setIcon(iconChikorita);
				}
				else if(RBCyndaquil.isSelected()){
					pokemons.get(membershipOfCyndaquill).battle();
					statusArea.setText(pokemonStatus(membershipOfCyndaquill));
					iconPokemon.setIcon(iconCyndaquil);
				}

				else if(RBTotodile.isSelected()){
					pokemons.get(membershipOfTotodile).battle();
					statusArea.setText(pokemonStatus(membershipOfTotodile));
					iconPokemon.setIcon(iconTotodile);
				}
			}
		});
		
		header.add(feedButton);
		header.add(walkButton);
		header.add(petButton);
		header.add(battleButton);
		header.add(pokemonCenterButton);

		center.add(iconPokemon);

		//right
		statusArea = new JTextArea("", 10, 7);
		right.add(statusArea);

		//all 3 radio listener
		RBChikorita.addActionListener(new ActionListener(){
		
			@Override
			public void actionPerformed(ActionEvent e) {
				iconPokemon.setIcon(iconChikorita);
				statusArea.setText(pokemonStatus(membershipOfChokorita));
			}
		});

		RBCyndaquil.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				iconPokemon.setIcon(iconCyndaquil);	
				statusArea.setText(pokemonStatus(membershipOfCyndaquill));
			}
		});

		RBTotodile.addActionListener(new ActionListener(){
		
			@Override
			public void actionPerformed(ActionEvent e) {
				iconPokemon.setIcon(iconTotodile);
				statusArea.setText(pokemonStatus(membershipOfTotodile));
			}
		});

		footer.add(selectLabel);
		footer.add(RBChikorita);
		footer.add(RBCyndaquil);
		footer.add(RBTotodile);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 400);
		// pack();
		setVisible(true);
	}

	public void petPokemon(int member){
		pokemons.get(member).happy();
	}

}
