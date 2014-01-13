package P

type T struct {
	x, y int
}

var _ = [42]T{
	T{},
	T{1, 2},
	T{3, 4},
}

var _ = [ ... ]T{
T{},
	  T{1, 2},
T{3, 4},
}

var _ = []T{
T{},
	  T{1, 2},
	T{3, 4},
}

var _ = []T{
	T{},
  	10: T{1, 2},
	20: T{3, 4},
}

var _ = [ ] struct    {
	x,   y  int
} {
	struct { x, y int } { },
	10: struct{ x, y int }{1, 2},
	20: struct{ x, y int }{3, 4},
}
var _=[ ] interface{}{
	T{},
	10: T{1, 2},
	20: T{3, 4},
}

var _ = [][]int{
	[]int{},
	[]int{1, 2},
	[]int{3, 4},
}

var _ = [][]int{
	([]int{}),
	([]int{1, 2}),
	[]int{3, 4},
}

var _ = [][][]int{
	[][]int{},
	[][]int{
		[]int{},
		[]int{0, 1, 2, 3},
		[]int{4, 5},
	},
}

var _ = map[string]T{
	"foo": T{},
	"bar": T{1, 2},
	"bal": T{3, 4},
}

var _ = map[string]struct {
	x, y int
}{
	"foo": struct{ x, y int }{},
	"bar": struct{ x, y int }{1, 2},
	"bal": struct{ x, y int }{3, 4},
}

var _ = map[string]interface{}{
	"foo": T{},
	"bar": T{1, 2},
	"bal": T{3, 4},
}

var _ = map[string][]int{
	"foo": []int{},
	"bar": []int{1, 2},
	"bal": []int{3, 4},
}

var _ = map[string][]int{
	"foo": ([]int{}),
	"bar": ([]int{1, 2}),
	"bal": []int{3, 4},
}

// from exp/4s/data.go
var pieces4 = []Piece{
	Piece{0, 0, Point{4, 1}, []Point{Point{0, 0}, Point{1, 0}, Point{1, 0}, Point{1, 0}}, nil, nil},
	Piece{1, 0, Point{1, 4}, []Point{Point{0, 0}, Point{0, 1}, Point{0, 1}, Point{0, 1}}, nil, nil},
	Piece{2, 0, Point{4, 1}, []Point{Point{0, 0}, Point{1, 0}, Point{1, 0}, Point{1, 0}}, nil, nil},
	Piece{3, 0, Point{1, 4}, []Point{Point{0, 0}, Point{0, 1}, Point{0, 1}, Point{0, 1}}, nil, nil},
}

var _ = [42]*T{
	&T{},
	&T{1, 2},
	&T{3, 4},
}

var _ = [...]*T{
	&T{},
	&T{1, 2},
	&T{3, 4},
}

var _ = []*T{
	&T{},
	&T{1, 2},
	&T{3, 4},
}

var _ = []*T{
	&T{},
	10: &T{1, 2},
	20: &T{3, 4},
}

var _ = []*struct {
	x, y int
}{
	&struct{ x, y int }{},
	10: &struct{ x, y int }{1, 2},
	20: &struct{ x, y int }{3, 4},
}

var _ = []interface{}{
	&T{},
	10: &T{1, 2},
	20: &T{3, 4},
}

var _ = []*[]int{
	&[]int{},
	&[]int{1, 2},
	&[]int{3, 4},
}

var _ = []*[]int{
	(&[]int{}),
	(&[]int{1, 2}),
	&[]int{3, 4},
}

var _ = []*[]*[]int{
	&[]*[]int{},
	&[]*[]int{
		&[]int{},
		&[]int{0, 1, 2, 3},
		&[]int{4, 5},
	},
}

var _ = map[string]*T{
	"foo": &T{},
	"bar": &T{1, 2},
	"bal": &T{3, 4},
}

var _ = map[string]*struct {
	x, y int
}{
	"foo": &struct{ x, y int }{},
	"bar": &struct{ x, y int }{1, 2},
	"bal": &struct{ x, y int }{3, 4},
}

var _ = map[string]interface{}{
	"foo": &T{},
	"bar": &T{1, 2},
	"bal": &T{3, 4},
}

var _ = map[string]*[]int{
	"foo": &[]int{},
	"bar": &[]int{1, 2},
	"bal": &[]int{3, 4},
}

var _ = map[string]*[]int{
	"foo": (&[]int{}),
	"bar": (&[]int{1, 2}),
	"bal": &[]int{3, 4},
}

var pieces4 = []*Piece{
	&Piece{0, 0, Point{4, 1}, []Point{Point{0, 0}, Point{1, 0}, Point{1, 0}, Point{1, 0}}, nil, nil},
	&Piece{1, 0, Point{1, 4}, []Point{Point{0, 0}, Point{0, 1}, Point{0, 1}, Point{0, 1}}, nil, nil},
	&Piece{2, 0, Point{4, 1}, []Point{Point{0, 0}, Point{1, 0}, Point{1, 0}, Point{1, 0}}, nil, nil},
	&Piece{3, 0, Point{1, 4}, []Point{Point{0, 0}, Point{0, 1}, Point{0, 1}, Point{0, 1}}, nil, nil},
}