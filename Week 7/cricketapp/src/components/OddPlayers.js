export default function OddPlayers({ players }) {
  const oddPlayers = players.filter((_, index) => index % 2 === 0);

  return (
    <ul>
      {oddPlayers.map((player, index) => (
        <li key={index}>Odd Player: {player}</li>
      ))}
    </ul>
  );
}
