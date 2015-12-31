# PoemGenerator

This Java project creates a random poem generator using the following grammatical rules:

POEM: <LINE> <LINE> <LINE> <LINE> <LINE>

LINE: <NOUN>|<PREPOSITION>|<PRONOUN> $LINEBREAK

ADJECTIVE: black|white|dark|light|bright|murky|muddy|clear <NOUN>|<ADJECTIVE>|$END

NOUN: heart|sun|moon|thunder|fire|time|wind|sea|river|flavor|wave|willow|rain|tree|flower|field|meadow|pasture|harvest|water|father|mother|brother|sister <VERB>|<PREPOSITION>|$END

PRONOUN: my|your|his|her <NOUN>|<ADJECTIVE>

VERB: runs|walks|stands|climbs|crawls|flows|flies|transcends|ascends|descends|sinks <PREPOSITION>|<PRONOUN>|$END

PREPOSITION: above|across|against|along|among|around|before|behind|beneath|beside|between|beyond|during|inside|onto|outside|under|underneath|upon|with|without|through <NOUN>|<PRONOUN>|<ADJECTIVE>


•	To the left of the colon is the name of the rule

•	To the right of the colon is the rule definition which can consist of words, keywords and references to other rules.

•	A reference to another rule is marked with angle brackets, for example <NOUN>. Rules can reference themselves, making them recursive.

•	Keywords are marked with $. There are two keywords: LINEBREAK and END. LINEBREAK adds a line break to the output, END marks that the end of a line has been reached. This means that a line can only end with an adjective, a noun or a verb.

•	A grouping of elements separated by | means that one of those elements should be selected at random.

•	Anything else that is plain text can be considered a word, for example  murky or  heart.

For example, the rule PRONOUN is defined as my|your|his|her <NOUN>|<ADJECTIVE> which means that one of the words my, your, his or her should be selected at random followed by either a NOUN or an ADJECTIVE, also selected at random.

