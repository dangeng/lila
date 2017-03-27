package lila.shutup

/**
 * - words are automatically pluralized. "tit" will also match "tits"
 * - words are automatically leetified. "tit" will also match "t1t", "t-i-t", and more.
 * - words do not partial match. "anal" will NOT match "analysis".
 */
private object Dictionary {

  def en = dict("""
(c|k)oc?k(y|suc?ker|)
(c|k)um(shot|)
(c|k)unt(ing|)
(f+|ph)(u{1,}|a{1,}|e{1,})c?k(er|r|u|k|ed|d|t|ing?|ign|en|tard?|face|off?|)
fck(er|r|u|k|ed|d|t|ing?|ign|tard?|face|off?|)
abortion
adol(f|ph)
anal(plug|sex|)
anus
arse(hole|wipe|)
ass
ass?(hole|fag)
aus?c?hwitz
ball
bastard?
bewb
bimbo
bitche?
blow
blowjob
blumpkin
bollock
boner
boob
bugger
buk?kake
bull?shit
cancer
cawk
chess(|-|_)bot(.?com)?
chink
choad
clit
clitoris
clown
condom
coon
cooter
cornhole
coward?
crap
cunn?ilingu
dic?k(head|face|suc?ker|)
dildo
dogg?ystyle
dong
douche(bag|)
dyke
(f|ph)ag
(f|ph)agg?ot
fanny
(f|ph)art
foreskin
gangbang
gay
genital
genitalia
gobshite?
gook
gypo
handjob
hell
hitler+
homm?o(sexual|)
honkey
hooker
hore
horny
humping
idiot
incest
jerk
jizz?(um|)
kaffir
kike
labia
lesbo
masturbat(e|ion|ing)
milf
molest
moron
mother
motherfuc?k(er|)
mthrfckr
muff
nazi
negro
nigg?(er|a|ah)
nonce
nutsac?k
pa?edo
pa?edo(f|ph)ile
paki
pecker
pederast
pen(1|i)s
pig
pimp
piss
poof
poon
poop(face|)
porn
pric?k
pron
prostitute
punani
puss(i|y|ie|)
queef
queer
quim
raped?
rapist
rect(al|um)
retard(ed|)
rimjob
schlong
screw(d|ed|)
scrotum
scum(bag|)
semen
sex
shag
shemale
shit(z|e|y|ty|bag|)
sister
slag
slut
spastic
spaz
sperm
spick
spoo
spooge
spunk
stfu
stripper
stupid
suc?k
taint
tart
terrorist
tit(s|ies|ties|ty)(fuc?k)
tosser
turd
twat
vag
vagin(a|al|)
vibrator
vulva
wanc?k(er|)
wetback
whore?
wog
""")

  def ru = dict("""
сука
пизда
pidar
""")

  private def dict(words: String) = words.lines.filter(_.nonEmpty)
}
